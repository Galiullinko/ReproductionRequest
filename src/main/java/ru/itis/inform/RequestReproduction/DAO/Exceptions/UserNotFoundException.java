package ru.itis.inform.RequestReproduction.dao.exceptions;

/**
 * Created by Galiullin_ko on 18/04/16.
 */
public class UserNotFoundException extends RuntimeException {
    String message = "";
    public UserNotFoundException(int id) {
        message = "Cannot find user with "+id+" id";
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
