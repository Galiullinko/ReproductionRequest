package ru.itis.inform.RequestReproduction.DAO.Documents;

import ru.itis.inform.RequestReproduction.DAO.Models.Document;

import java.util.List;

/**
 * Created by Galiullin_ko on 07/04/16.
 */
public interface DocumentDAO {
    /**
     * You'll get document by its id
     * @param id id of document
     * @return document by id
     */
    Document getDocumentById(int id);

    /**
     * Add document in storage
     * @param doc document, which you want to add
     * @return successful of operation
     */
    boolean addDocument(Document doc);

    /**
     * Remove document with given id
     * @param id id
     */
    void removeDocument(int id);

    List<Document> getDocuments(int userId);


}
