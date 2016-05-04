package ru.itis.inform.RequestReproduction.controllers.dto.converters;

import ru.itis.inform.RequestReproduction.controllers.dto.*;
import ru.itis.inform.RequestReproduction.dao.models.*;

import java.util.List;
import java.util.Map;

/**
 * Created by Galiullin_ko on 20/04/16.
 */
public interface DTOConverter {
    DocumentDTO getDocumentDTO(Document entity);
    DocumentsDTO getDocumentsDTO(List<Document> entities);
    AuthPairDTO getAuthPairDTO(AuthPair entity);
    TokenDTO getTokenDTO(Token entity);
    //из dto модель
    Map<String, Integer> getIdsAsIntegerMap();
    Document getDocumentDAO(DocumentDTO dto);
    User getUserDAO (UserDTO dto);
    AuthPair getAuthPairDAO(AuthPairDTO dto);
    Token getTokenDTO(TokenDTO dto);
}
