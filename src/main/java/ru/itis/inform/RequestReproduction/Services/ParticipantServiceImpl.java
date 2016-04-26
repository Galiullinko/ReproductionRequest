package ru.itis.inform.RequestReproduction.services;

import org.springframework.beans.factory.annotation.Autowired;
import ru.itis.inform.RequestReproduction.dao.models.Participant;
import ru.itis.inform.RequestReproduction.dao.participants.ParticipantDAO;

import java.util.List;

/**
 * Created by Galiullin_ko on 20/04/16.
 */
public class ParticipantServiceImpl implements ParticipantService {
    @Autowired
    ParticipantDAO participantDAO;

    @Override
    public Participant getParticipantById(int id) {
        return participantDAO.getParticipantById(id);
    }

    @Override
    public List<Participant> getParticipants() {
        return participantDAO.getParticipants(1);
    }
}
