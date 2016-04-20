package ru.itis.inform.RequestReproduction.Controllers.DTO;

import ru.itis.inform.RequestReproduction.DAO.Models.Document;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.Iterator;
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
