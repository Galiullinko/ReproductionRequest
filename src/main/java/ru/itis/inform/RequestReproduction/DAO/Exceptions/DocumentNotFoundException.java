package ru.itis.inform.RequestReproduction.DAO.Exceptions;

/**
 * Created by Galiullin_ko on 18/04/16.
 */
public class DocumentNotFoundException extends RuntimeException {
    String message = "";
    public DocumentNotFoundException(int id) {
        message = "Cannot find document with "+id+" id";
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
