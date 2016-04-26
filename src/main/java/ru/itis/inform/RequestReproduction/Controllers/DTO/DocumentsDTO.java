package ru.itis.inform.RequestReproduction.controllers.dto;

import ru.itis.inform.RequestReproduction.dao.models.Document;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Galiullin_ko on 20/04/16.
 */
public class DocumentsDTO {
    private List<DocumentDTO> documents = new ArrayList<DocumentDTO>();

    public List<DocumentDTO> getDocuments() { return documents; }

    public void addDocuments(List<Document> list) {
        if (!list.isEmpty()) {
            for (int i = 0; i < list.size(); i++ ) {
                DocumentDTO dto = new DocumentDTO(list.get(i));
                documents.add(dto);
            }
        }
    }
}
