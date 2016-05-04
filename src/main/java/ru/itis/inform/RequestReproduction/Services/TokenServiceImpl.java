package ru.itis.inform.RequestReproduction.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.itis.inform.RequestReproduction.dao.models.AuthPair;
import ru.itis.inform.RequestReproduction.dao.models.Token;
import ru.itis.inform.RequestReproduction.dao.models.User;
import ru.itis.inform.RequestReproduction.dao.tokens.TokenDAO;

/**
 * Created by Galiullin_ko on 26/04/16.
 */
@Component
public class TokenServiceImpl implements TokenService {
    @Autowired
    TokenDAO tokensDao;

    @Override
    public void setToken(User user, AuthPair authPair) {
        tokensDao.setToken(user, authPair);
    }

    @Override
    public String getToken(int userId) {
        Token token = tokensDao.getToken(userId);
        return token.getToken();
    }

    @Override
    public String getToken(User user) {
        Token token = tokensDao.getToken(user.getUserId());
        return token.getToken();
    }

    @Override
    public void verifyToken(String token) {
        tokensDao.verifyToken(token);

    }

    @Override
    public Token getToken(String token) {
        return tokensDao.getToken(token);
    }

}
