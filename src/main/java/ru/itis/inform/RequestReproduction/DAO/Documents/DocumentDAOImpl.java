package ru.itis.inform.RequestReproduction.DAO.Documents;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import ru.itis.inform.RequestReproduction.DAO.DAOArgumentsVerifier;
import ru.itis.inform.RequestReproduction.DAO.JDBC.ParamsMapper;
import ru.itis.inform.RequestReproduction.DAO.JDBC.SQLQueryExecutor;
import ru.itis.inform.RequestReproduction.DAO.Models.Document;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import static java.util.Arrays.asList;

/**
 * Created by Galiullin_ko on 09/04/16.
 */
public class DocumentDAOImpl implements DocumentDAO {
//TODO
    @Autowired
    DAOArgumentsVerifier daoArgumentsVerifier;
    @Autowired
    private ParamsMapper paramsMapper;
    @Autowired
    private SQLQueryExecutor sqlQueryExecutor;

    // language=SQL
    public static final String SQL_GET_DOCUMENT_BY_ID = "SELECT * FROM document WHERE (id = :documentId)";
    // language=SQL
    public static final String SQL_GET_LIST_OF_DOCUMENTS = "SELECT * FROM document WHERE (userid = :userId)";






    private final RowMapper<Document> DOCUMENT_ROW_MAPPER = new RowMapper<Document>() {
        @Override
        public Document mapRow(ResultSet resultSet, int i) throws SQLException {
            try {
                return new Document(resultSet.getInt("documentId"), resultSet.getInt("participantId"),
                        resultSet.getInt("yearOfWorks"), resultSet.getString("goal"),
                        resultSet.getDate("dateOfEndOfTheWork"), resultSet.getString("stateOfCreature"),
                        resultSet.getString("typeOfCreature"), resultSet.getInt("numberOfCreatures"),
                        resultSet.getString("nameOfWorkLocation"), resultSet.getInt("averegePieceOfWaterResources"),
                        resultSet.getInt("weightOfCreatures"), resultSet.getString("sourceOfResources"), resultSet.getDate("dateOfFillingTheDocument"));
            }catch (SQLException e){
                throw new IllegalArgumentException(e);
            }
        }
    };

    @Override
    public List<Document> getDocuments(int userId) {
        daoArgumentsVerifier.verifyUser(userId);
        Map<String, Object> paramMap = paramsMapper.asMap(asList("userId"), asList(userId));
        return sqlQueryExecutor.queryForObjects(SQL_GET_LIST_OF_DOCUMENTS, paramMap, DOCUMENT_ROW_MAPPER);

    }

    @Override
    public Document getDocumentById(int documentId) {
        daoArgumentsVerifier.verifyDocument(documentId);
        Map<String, Object> paramMap = paramsMapper.asMap(asList("documentId"), asList(documentId));
        return sqlQueryExecutor.queryForObject(SQL_GET_DOCUMENT_BY_ID, paramMap, DOCUMENT_ROW_MAPPER);

    }

    @Override
    public boolean addDocument(Document doc) {
        //TODO
        return false;
    }

    @Override
    public void removeDocument(int id) {
        //TODO
    }

    public static void main(String[] args) {
        DocumentDAOImpl d = new DocumentDAOImpl();
        System.out.println(d.getDocumentById(1).toString());
    }
}
