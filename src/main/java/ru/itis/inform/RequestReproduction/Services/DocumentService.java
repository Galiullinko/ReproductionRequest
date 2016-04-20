package ru.itis.inform.RequestReproduction.Services;

import ru.itis.inform.RequestReproduction.DAO.Models.Document;

import java.util.List;

/**
 * Created by Galiullin_ko on 20/04/16.
 */
public interface DocumentService {
    Document getDocumentById(int id);
    List<Document> getDocuments();
}
