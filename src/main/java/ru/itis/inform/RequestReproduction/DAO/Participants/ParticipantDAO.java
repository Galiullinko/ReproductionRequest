package ru.itis.inform.RequestReproduction.dao.participants;

import ru.itis.inform.RequestReproduction.dao.models.Participant;

import java.util.List;

/**
 * Created by Galiullin_ko on 20/04/16.
 */
public interface ParticipantDAO {
    Participant getParticipantById(int id);
    List<Participant> getParticipants(int id);
    Participant getParticipantByDocument(int id);
    void addParticipant(Participant participant);
    void destroy(int id);
}
