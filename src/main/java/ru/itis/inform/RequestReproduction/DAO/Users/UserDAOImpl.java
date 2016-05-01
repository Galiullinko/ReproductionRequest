package ru.itis.inform.RequestReproduction.dao.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import ru.itis.inform.RequestReproduction.dao.DAOArgumentsVerifier;
import ru.itis.inform.RequestReproduction.dao.jdbc.ParamsMapper;
import ru.itis.inform.RequestReproduction.dao.jdbc.SQLQueryExecutor;
import ru.itis.inform.RequestReproduction.dao.models.User;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

import static java.util.Arrays.asList;

/**
 * Created by Galiullin_ko on 09/04/16.
 */
@Component
public class UserDAOImpl implements UserDAO {
    @Autowired
    DAOArgumentsVerifier daoArgumentsVerifier;
    @Autowired
    ParamsMapper paramsMapper;
    @Autowired
    SQLQueryExecutor sqlQueryExecutor;

    // language=SQL
    public static final String SQL_GET_USER_BY_ID = "SELECT * FROM users WHERE (id = :userId) ";
    // language=SQL
    public static final String SQL_INSERT_USER_INTO_USERS="INSERT INTO users VALUES (:userid, :name, :surname, :patronymic, :seriesofthepassport, :numberofthepassport, :phonenumber, :email)";

    static final RowMapper<User> USER_ROW_MAPPER = new RowMapper<User>() {
        @Override
        public User mapRow(ResultSet resultSet, int i) throws SQLException {
            try {
                return new User(resultSet.getInt("id"), resultSet.getString("name"),
                        resultSet.getString("surname"), resultSet.getString("patronymic"),
                        resultSet.getString("seriesOfThePassport"), resultSet.getString("numberOfThePassport"),
                        resultSet.getString("phoneNumber"), resultSet.getString("email"));
            } catch (SQLException e) {
                throw new IllegalArgumentException(e);
            }
        }
    };
    @Override
    public User getUser(int userId) {
        daoArgumentsVerifier.verifyUser(userId);
        Map<String, Object> paramMap = paramsMapper.asMap(asList("userId"), asList(userId));
        return sqlQueryExecutor.queryForObject(SQL_GET_USER_BY_ID, paramMap, USER_ROW_MAPPER);

    }

    @Override
    public void addUser(User user) {
        daoArgumentsVerifier.verifyUser(user.getUserId());
        Map<String, Object> paramMap = paramsMapper.asMap(asList("userid", "name", "surname", "patronymic", "seriesofthepassport", "numberofthepassport", "phonenumber", "email"),
                asList(user.getUserId(),user.getName(), user.getSurname(), user.getPatronymic(),
                        user.getSeriesOfThePassport(), user.getNumberOfThePassport(), user.getPhoneNumber(), user.getEmail()));
        sqlQueryExecutor.updateQuery(SQL_INSERT_USER_INTO_USERS, paramMap);


    }
}
