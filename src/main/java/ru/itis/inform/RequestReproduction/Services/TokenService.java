package ru.itis.inform.RequestReproduction.services;

import ru.itis.inform.RequestReproduction.dao.models.AuthPair;
import ru.itis.inform.RequestReproduction.dao.models.User;

/**
 * Created by Galiullin_ko on 26/04/16.
 */
public interface TokenService {
    void setToken(User user, AuthPair authPair);
    String getToken(int userId);
    String getToken(User user);
    void verifyToken(String token);
}
