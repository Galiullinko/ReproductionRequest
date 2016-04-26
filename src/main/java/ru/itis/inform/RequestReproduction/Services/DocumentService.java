package ru.itis.inform.RequestReproduction.services;

import ru.itis.inform.RequestReproduction.dao.models.Document;

import java.util.List;

/**
 * Created by Galiullin_ko on 20/04/16.
 */
public interface DocumentService {
    Document getDocumentById(int id);
    List<Document> getDocuments();
}
