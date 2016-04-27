package ru.itis.inform.RequestReproduction.dao.tokens;


import ru.itis.inform.RequestReproduction.dao.models.AuthPair;
import ru.itis.inform.RequestReproduction.dao.models.Token;
import ru.itis.inform.RequestReproduction.dao.models.User;

/**
 * Created by Galiullin_ko on 25/04/16.
 */
public interface TokenDAO {
    void setToken(User user, AuthPair authPair);
    Token getToken(int userId);
    void verifyToken(String token);
}
