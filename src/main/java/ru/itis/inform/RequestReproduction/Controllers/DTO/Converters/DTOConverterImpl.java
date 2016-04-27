package ru.itis.inform.RequestReproduction.controllers.dto.converters;

import org.springframework.stereotype.Component;
import ru.itis.inform.RequestReproduction.controllers.dto.*;
import ru.itis.inform.RequestReproduction.dao.models.*;

import java.util.List;
import java.util.Map;

/**
 * Created by Galiullin_ko on 20/04/16.
 */
@Component
public class DTOConverterImpl implements DTOConverter {

    @Override
    public DocumentDTO getDocumentDTO(Document entity) {
        DocumentDTO dto = new DocumentDTO(entity);
        return dto;
    }

    @Override
    public DocumentsDTO getDocumentsDTO(List<Document> entities) {
        DocumentsDTO dto = new DocumentsDTO();
        dto.addDocuments(entities);
        return dto;
    }

    @Override
    public ParticipantsDTO getParticipantsDTO(List<Participant> entities) {
        ParticipantsDTO dto = new ParticipantsDTO();
        dto.addDocuments(entities);
        return dto;
    }

    @Override
    public AuthPairDTO getAuthPairDTO(AuthPair entity) {
        AuthPairDTO dto = new AuthPairDTO(entity);
        return dto;
    }

    @Override
    public TokenDTO getTokenDTO(Token entity) {
        TokenDTO dto = new TokenDTO(entity);
        return dto;
    }

    @Override
    public Map<String, Integer> getIdsAsIntegerMap() {
        return null;
    }

    @Override
    public Document getDocumentDAO(DocumentDTO dto) {
        Document document = new Document(dto.getDocumentId(), dto.getParticipantId(),
                dto.getYearOfWorks(), dto.getGoal(), dto.getDateOfEndOfTheWork(), dto.getStateOfCreature(),
                dto.getTypeOfCreature(), dto.getNumberOfCreatures(), dto.getNameOfWorkLocation(),
                dto.getAveregePieceOfWaterResources(), dto.getWeightOfCreatures(), dto.getSourceOfResources(),
                dto.getDateOfFillingTheDocument());
        return document;
    }

    @Override
    public Participant getParticipantDAO(ParticipantDTO dto) {
        Participant participants = new Participant(dto.getUserId(), dto.getUserId(), dto.isIE(), dto.getNameOfEntity(),
                dto.getIdOfTaxpayer(), dto.getLocation(), dto.getMainStateRegistrationNumber(), dto.getNameOfIE(),
                dto.getSurnameOfIE(), dto.getPatronymicOfIE());
        return participants;
    }

    @Override
    public User getUserDAO(UserDTO dto) {
        User user = new User(dto.getUserId(), dto.getName(), dto.getSurname(), dto.getPatronymic(), dto.getSeriesOfThePassport(),
                dto.getNumberOfThePassport(), dto.getPhoneNumber(), dto.getEmail());
        return user;
    }

    @Override
    public AuthPair getAuthPairDAO(AuthPairDTO dto) {
        AuthPair authPair = new AuthPair(dto.getUserId(), dto.getLogin(), dto.getPassword());
        return authPair;
    }

    @Override
    public Token getTokenDTO(TokenDTO dto) {
        Token token = new Token(dto.getUserId(), dto.getToken());
        return token;
    }
}
