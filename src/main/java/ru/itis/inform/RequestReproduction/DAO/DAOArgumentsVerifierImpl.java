package ru.itis.inform.RequestReproduction.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.itis.inform.RequestReproduction.dao.exceptions.DocumentNotFoundException;
import ru.itis.inform.RequestReproduction.dao.exceptions.ParticipantNotFoundException;
import ru.itis.inform.RequestReproduction.dao.exceptions.TokenNotFoundException;
import ru.itis.inform.RequestReproduction.dao.exceptions.UserNotFoundException;
import ru.itis.inform.RequestReproduction.dao.jdbc.ParamsMapper;
import ru.itis.inform.RequestReproduction.dao.jdbc.SQLQueryExecutor;

import java.util.Map;

import static java.util.Arrays.asList;

/**
 * Created by Galiullin_ko on 18/04/16.
 */
@Component
public class DAOArgumentsVerifierImpl implements DAOArgumentsVerifier {
    //language=SQL
    private static final String SQL_COUNT_USERS_BY_ID =
            "SELECT COUNT(*) FROM users WHERE (id = :userId)";
    //language=SQL
    private static final String SQL_COUNT_DOCUMENTS_BY_ID =
            "SELECT COUNT(*) FROM documents WHERE (id = :documentId)";
    //language=SQL
    private static final String SQL_COUNT_PARTICIPANTS_BY_ID =
            "SELECT COUNT(*) FROM participants WHERE (id = :participantId)";
    //language=SQL
    private static final String SQL_COUNT_TOKENS_BY_ID=
            "SELECT COUNT(*) FROM tokens WHERE (token = :token)";

    @Autowired
    private SQLQueryExecutor sqlQueryExecutor;

    @Autowired
    private ParamsMapper paramsMapper;

    @Override
    public void verifyUser(int userId) {
        Map<String, Object> paramMap = paramsMapper.asMap(asList("userId"), asList(userId));
        int usersCount = sqlQueryExecutor.queryForInt(SQL_COUNT_USERS_BY_ID, paramMap);
        if (usersCount != 1) {
            throw new UserNotFoundException(userId);
        }

    }

    @Override
    public void verifyDocument(int documentId) {
        Map<String, Object> paranMap = paramsMapper.asMap(asList("docuentId"), asList(documentId));
        int documentCount = sqlQueryExecutor.queryForInt(SQL_COUNT_DOCUMENTS_BY_ID, paranMap);
        if (documentCount != 1){
            throw new DocumentNotFoundException(documentId);
        }

    }

    @Override
    public void verifyParticipant(int participantId) {
        Map<String, Object> paranMap = paramsMapper.asMap(asList("participantId"), asList(participantId));
        int participantCount = sqlQueryExecutor.queryForInt(SQL_COUNT_PARTICIPANTS_BY_ID, paranMap);
        if (participantCount != 1){
            throw new ParticipantNotFoundException(participantId);
        }
    }

    @Override
    public void verifyToken(String token) {
        Map<String, Object> paranMap = paramsMapper.asMap(asList("token"), asList(token));
        int tokenCount = sqlQueryExecutor.queryForInt(SQL_COUNT_TOKENS_BY_ID,paranMap);
        if (tokenCount != 1) {
            throw new TokenNotFoundException(token);
        }
    }
}
