package ru.itis.inform.RequestReproduction.controllers.dto;

import ru.itis.inform.RequestReproduction.dao.models.Participant;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Galiullin_ko on 20/04/16.
 */
public class ParticipantsDTO {
    private List<ParticipantDTO> participants = new ArrayList<ParticipantDTO>();

    public List<ParticipantDTO> getParticipants() { return participants; }

    public void addDocuments(List<Participant> list) {
        if (!list.isEmpty()) {
            for (int i = 0; i < list.size(); i++ ) {
                ParticipantDTO dto = new ParticipantDTO(list.get(i));
                participants.add(dto);
            }
        }
    }
}
