package ru.itis.inform.RequestReproduction.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.itis.inform.RequestReproduction.dao.authPairs.AuthPairDAO;
import ru.itis.inform.RequestReproduction.dao.models.AuthPair;

/**
 * Created by Galiullin_ko on 26/04/16.
 */
@Component
public class AuthPairServiceImpl implements AuthPairService {
    @Autowired
    private AuthPairDAO authPairDAO;

    @Override
    public void addAuthPair(AuthPair authPair) {
        authPairDAO.addAuthPair(authPair);
    }

    @Override
    public AuthPair getAuthPair(int id) {
        return authPairDAO.getAuthPair(id);
    }
}
