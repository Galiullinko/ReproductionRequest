package ru.itis.inform.RequestReproduction.Services;

import ru.itis.inform.RequestReproduction.DAO.Models.Participant;

import java.util.List;

/**
 * Created by Galiullin_ko on 20/04/16.
 */
public interface ParticipantService {
    Participant getParticipantById(int id);
    List<Participant> getParticipants();
}
