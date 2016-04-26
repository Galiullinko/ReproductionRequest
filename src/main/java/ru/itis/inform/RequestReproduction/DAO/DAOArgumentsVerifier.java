package ru.itis.inform.RequestReproduction.dao;

/**
 * Created by Galiullin_ko on 18/04/16.
 */
public interface DAOArgumentsVerifier {
    void verifyUser(int id);
    void verifyDocument(int id);
    void verifyParticipant(int id);
    void verifyToken(String token);
}
