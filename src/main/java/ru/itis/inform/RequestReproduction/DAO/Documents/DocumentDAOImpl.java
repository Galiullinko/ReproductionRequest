package ru.itis.inform.RequestReproduction.dao.documents;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import ru.itis.inform.RequestReproduction.dao.DAOArgumentsVerifier;
import ru.itis.inform.RequestReproduction.dao.jdbc.ParamsMapper;
import ru.itis.inform.RequestReproduction.dao.jdbc.SQLQueryExecutor;
import ru.itis.inform.RequestReproduction.dao.models.Document;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import static java.util.Arrays.asList;

/**
 * Created by Galiullin_ko on 09/04/16.
 */
@Component
public class DocumentDAOImpl implements DocumentDAO {
    @Autowired
    DAOArgumentsVerifier daoArgumentsVerifier;
    @Autowired
    private ParamsMapper paramsMapper;
    @Autowired
    private SQLQueryExecutor sqlQueryExecutor;

    // language=SQL
    public static final String GET_DOCUMENT_BY_ID = "SELECT * FROM documents WHERE (id = :documentId)";
    // language=SQL
    public static final String GET_DOCUMENTS_OF_USER = "SELECT * FROM documents WHERE (userid = :userId)";


    private final RowMapper<Document> DOCUMENT_ROW_MAPPER = new RowMapper<Document>() {
        @Override
        public Document mapRow(ResultSet resultSet, int i) throws SQLException {
            try {
                return new Document(resultSet.getInt("id"), resultSet.getInt("userId"),
                        resultSet.getInt("yearOfWorks"), resultSet.getString("goal"),
                        resultSet.getDate("dateOfEndOfTheWork"), resultSet.getString("stateOfCreature"),
                        resultSet.getString("typeOfCreature"), resultSet.getInt("numberOfCreatures"),
                        resultSet.getString("nameOfWorkLocation"), resultSet.getInt("averegePieceOfWaterResources"),
                        resultSet.getInt("weightOfCreatures"), resultSet.getString("sourceOfResources"), resultSet.getDate("dateOfFillingTheDocument"),
                        resultSet.getString("nameOfEntity"), resultSet.getString("idOfTaxpayer"), resultSet.getString("location"),
                        resultSet.getString("mainStateRegistrationNumber"), resultSet.getString("nameOfIE"),
                        resultSet.getString("surnameOfIE"), resultSet.getString("patronymicOfIE"));
            }catch (SQLException e){
                throw new IllegalArgumentException(e);
            }
        }
    };

    @Override
    public List<Document> getDocuments(int userId) {
        daoArgumentsVerifier.verifyUser(userId);
        Map<String, Object> paramMap = paramsMapper.asMap(asList("userId"), asList(userId));
        return sqlQueryExecutor.queryForObjects(GET_DOCUMENTS_OF_USER, paramMap, DOCUMENT_ROW_MAPPER);

    }

    @Override
    public Document getDocumentById(int documentId) {
        daoArgumentsVerifier.verifyDocument(documentId);
        Map<String, Object> paramMap = paramsMapper.asMap(asList("documentId"), asList(documentId));
        return sqlQueryExecutor.queryForObject(GET_DOCUMENT_BY_ID, paramMap, DOCUMENT_ROW_MAPPER);

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
