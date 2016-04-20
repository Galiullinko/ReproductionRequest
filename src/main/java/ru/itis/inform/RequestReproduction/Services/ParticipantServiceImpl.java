package ru.itis.inform.RequestReproduction.Services;

import org.springframework.beans.factory.annotation.Autowired;
import ru.itis.inform.RequestReproduction.DAO.Models.Participant;
import ru.itis.inform.RequestReproduction.DAO.Participants.ParticipantDAO;

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
        return participantDAO.getPartcipants();
    }
}
