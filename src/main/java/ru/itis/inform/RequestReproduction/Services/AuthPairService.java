package ru.itis.inform.RequestReproduction.services;

import ru.itis.inform.RequestReproduction.dao.models.AuthPair;

/**
 * Created by Galiullin_ko on 26/04/16.
 */
public interface AuthPairService {
    void addAuthPair(AuthPair authPair);
    AuthPair getAuthPair(int id);
}
