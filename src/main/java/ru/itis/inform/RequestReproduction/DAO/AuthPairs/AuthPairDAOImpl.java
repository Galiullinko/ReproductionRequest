package ru.itis.inform.RequestReproduction.dao.authPairs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import ru.itis.inform.RequestReproduction.dao.jdbc.ParamsMapper;
import ru.itis.inform.RequestReproduction.dao.jdbc.SQLQueryExecutor;
import ru.itis.inform.RequestReproduction.dao.models.AuthPair;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

import static java.util.Arrays.asList;

/**
 * Created by Galiullin_ko on 25/04/16.
 */
@Component
public class AuthPairDAOImpl implements AuthPairDAO {
    @Autowired
    ParamsMapper paramsMapper;
    @Autowired
    SQLQueryExecutor sqlQueryExecutor;
    // language=SQL
    public static final String SQL_GET_PASSWORD_INFO_FROM_PASSWORDSS = "SELECT * FROM authpairs WHERE (userId = :userId) ";
    // language=SQL
    public static final String SQL_INSERT_PASSWORDS_INTO_PASSWORDS = "INSERT INTO authpairs VALUES (:userId, :login, :password)";

    static final RowMapper<AuthPair> PASSWORDS_ROW_MAPPER = new RowMapper<AuthPair>() {
        @Override
        public AuthPair mapRow(ResultSet resultSet, int i) throws SQLException {
            try {
                return new AuthPair(resultSet.getInt("id"), resultSet.getString("login"),
                        resultSet.getString("password"));
            } catch (SQLException e) {
                throw new IllegalArgumentException(e);
            }
        }
    };
    @Override
    public void addAuthPair(AuthPair authPair) {
        Map<String, Object> paramMap = paramsMapper.asMap(asList("userId", "login", "password"),
                asList(authPair.getUserId(), authPair.getLogin(), authPair.getPassword()));
        sqlQueryExecutor.updateQuery(SQL_INSERT_PASSWORDS_INTO_PASSWORDS, paramMap);


    }

    @Override
    public AuthPair getAuthPair(int userId) {
        Map<String, Object> paramMap = paramsMapper.asMap(asList("userId"), asList(userId));
        return sqlQueryExecutor.queryForObject(SQL_GET_PASSWORD_INFO_FROM_PASSWORDSS,paramMap,PASSWORDS_ROW_MAPPER);
    }
}
