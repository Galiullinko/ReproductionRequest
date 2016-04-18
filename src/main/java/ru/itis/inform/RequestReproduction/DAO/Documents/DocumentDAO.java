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
    public Document getDocumentById(int id);

    /**
     * Add document in storage
     * @param doc document, which you want to add
     * @return successful of operation
     */
    public boolean addDocument(Document doc);

    /**
     * Remove document with given id
     * @param id id
     */
    public void removeDocument(int id);

    public List<Document> getDocuments();


}
