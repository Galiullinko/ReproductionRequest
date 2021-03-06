package ru.itis.inform.RequestReproduction.dao.tokens;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import ru.itis.inform.RequestReproduction.dao.DAOArgumentsVerifier;
import ru.itis.inform.RequestReproduction.dao.exceptions.BadUserInAuthPairException;
import ru.itis.inform.RequestReproduction.dao.jdbc.ParamsMapper;
import ru.itis.inform.RequestReproduction.dao.jdbc.SQLQueryExecutor;
import ru.itis.inform.RequestReproduction.dao.models.AuthPair;
import ru.itis.inform.RequestReproduction.dao.models.Token;
import ru.itis.inform.RequestReproduction.dao.models.User;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

import static java.util.Arrays.asList;

/**
 * Created by Galiullin_ko on 25/04/16.
 */
@Component
public class TokensDAOImpl implements TokenDAO {
    @Autowired
    ParamsMapper paramsMapper;
    @Autowired
    SQLQueryExecutor sqlQueryExecutor;
    @Autowired
    DAOArgumentsVerifier daoArgumentsVerifier;

    // language=SQL
    public static final String SQL_INSERT_TOKEN_INTO_TOKENS = "INSERT INTO tokens VALUES (:userId, :token)";
    // language=SQL
    public static  final String SQL_SELECT_TOKEN_FROM_TOKENS_BY_USERID = "SELECT token FROM tokens WHERE (userid = :userId)";
    // language=SQL
    public static final String SQL_SELECT_TOKEN_FROM_TOKENS_BY_TOKEN = "SELECT * FROM tokens WHERE (token = :token)";

    static final RowMapper<Token> TOKENS_ROW_MAPPER = new RowMapper<Token>() {
        @Override
        public Token mapRow(ResultSet resultSet, int i) throws SQLException {
            try {
                return new Token(resultSet.getInt("userId"), resultSet.getString("token"));
            } catch (SQLException e) {
                throw new IllegalArgumentException(e);
            }
        }
    };
    @Override
    public void setToken(User user, AuthPair authPair) {
        String token = "";
        if (user.getUserId() == authPair.getUserId()) {
            token = String.valueOf(user.hashCode() + authPair.hashCode());

            Map<String, Object> paramMap = paramsMapper.asMap(asList("userId", "token"),
                    asList(authPair.getUserId(), token));

            sqlQueryExecutor.updateQuery(SQL_INSERT_TOKEN_INTO_TOKENS,paramMap);
        } else  throw new BadUserInAuthPairException(user, authPair);

    }

    @Override
    public Token getToken(int userId) {
        Map<String, Object> paramMap = paramsMapper.asMap(asList("userId"), asList(userId));
        return sqlQueryExecutor.queryForObject(SQL_SELECT_TOKEN_FROM_TOKENS_BY_USERID,paramMap,TOKENS_ROW_MAPPER);
    }

    @Override
    public void verifyToken(String token) {
        daoArgumentsVerifier.verifyToken(token);

    }

    @Override
    public Token getToken(String token) {
        Map<String, Object> paramMap = paramsMapper.asMap(asList("token"), asList(token));
        return sqlQueryExecutor.queryForObject(SQL_SELECT_TOKEN_FROM_TOKENS_BY_TOKEN,paramMap,TOKENS_ROW_MAPPER);
    }
}
