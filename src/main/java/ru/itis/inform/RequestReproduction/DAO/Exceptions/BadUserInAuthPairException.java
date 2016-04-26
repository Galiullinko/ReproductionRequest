package ru.itis.inform.RequestReproduction.dao.exceptions;

import ru.itis.inform.RequestReproduction.dao.models.AuthPair;
import ru.itis.inform.RequestReproduction.dao.models.User;

/**
 * Created by Galiullin_ko on 26/04/16.
 */
public class BadUserInAuthPairException extends RuntimeException {
    String message = "";
    public BadUserInAuthPairException(User user, AuthPair authPair) {
        message = "User with "+user.getUserId() + " id is not equal with user in AuthPair ("+authPair.getUserId()+")";
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
