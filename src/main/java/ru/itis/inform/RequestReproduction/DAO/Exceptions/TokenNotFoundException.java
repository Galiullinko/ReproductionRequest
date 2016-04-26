package ru.itis.inform.RequestReproduction.dao.exceptions;

import ru.itis.inform.RequestReproduction.dao.models.AuthPair;
import ru.itis.inform.RequestReproduction.dao.models.User;

/**
 * Created by Galiullin_ko on 26/04/16.
 */
public class TokenNotFoundException extends RuntimeException {
    String message = "";
    public TokenNotFoundException(String token) {
        message = "Cannot find "+token+" token";
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public String getLocalizedMessage() {
        return message;
    }

    @Override
    public String toString() {
        return message;
    }
}
