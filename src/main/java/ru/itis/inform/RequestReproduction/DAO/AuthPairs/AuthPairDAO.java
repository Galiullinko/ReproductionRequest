package ru.itis.inform.RequestReproduction.dao.authPairs;

import ru.itis.inform.RequestReproduction.dao.models.AuthPair;

/**
 * Created by Galiullin_ko on 25/04/16.
 */
public interface AuthPairDAO {
    void addAuthPair(AuthPair authPair);
    AuthPair getAuthPair(int userId);
}
