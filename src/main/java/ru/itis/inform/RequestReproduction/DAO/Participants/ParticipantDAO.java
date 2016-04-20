package ru.itis.inform.RequestReproduction.DAO.Participants;

import ru.itis.inform.RequestReproduction.DAO.Models.Participant;

import java.util.List;
import java.util.regex.Pattern;

/**
 * Created by Galiullin_ko on 20/04/16.
 */
public interface ParticipantDAO {
    Participant getParticipantById(int id);
    List<Participant> getPartcipants();
    Participant getParticipantByDocument(int id);
    void destroy(int id);
}
