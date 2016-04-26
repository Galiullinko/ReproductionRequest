package ru.itis.inform.RequestReproduction.services;

import org.springframework.beans.factory.annotation.Autowired;
import ru.itis.inform.RequestReproduction.dao.documents.DocumentDAO;
import ru.itis.inform.RequestReproduction.dao.models.Document;

import java.util.List;

/**
 * Created by Galiullin_ko on 20/04/16.
 */
public class DocumentServiceImpl implements DocumentService {
    @Autowired
    DocumentDAO documentDAO;
    @Override
    public Document getDocumentById(int id) {
        return documentDAO.getDocumentById(id);
    }

    @Override
    public List<Document> getDocuments() {
        return documentDAO.getDocuments(1);
    }
}
