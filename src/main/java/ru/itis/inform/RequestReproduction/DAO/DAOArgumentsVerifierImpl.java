package ru.itis.inform.RequestReproduction.DAO;

/**
 * Created by Galiullin_ko on 18/04/16.
 */
public class DAOArgumentsVerifierImpl implements DAOArgumentsVerifier {
    //language=SQL
    private static final String SQL_COUNT_UESR_BY_ID =
            "SELECT COUNT(*) FROM users WHERE (id = :userId)";
    public void verifyUser(int id) {

    }

    public void verifyDocument(int id) {

    }

    public void verifyParticipant(int id) {

    }
}
