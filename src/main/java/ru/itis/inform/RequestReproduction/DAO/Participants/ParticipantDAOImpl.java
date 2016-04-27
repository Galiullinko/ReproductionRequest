package ru.itis.inform.RequestReproduction.dao.participants;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import ru.itis.inform.RequestReproduction.dao.DAOArgumentsVerifier;
import ru.itis.inform.RequestReproduction.dao.jdbc.ParamsMapper;
import ru.itis.inform.RequestReproduction.dao.jdbc.SQLQueryExecutor;
import ru.itis.inform.RequestReproduction.dao.models.Participant;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import static java.util.Arrays.asList;

/**
 * Created by Galiullin_ko on 20/04/16.
 */
@Component
public class ParticipantDAOImpl implements ParticipantDAO {
    @Autowired
    DAOArgumentsVerifier daoArgumentsVerifier;
    @Autowired
    ParamsMapper paramsMapper;
    @Autowired
    SQLQueryExecutor sqlQueryExecutor;

    // language=SQL
    public static final String GET_PARTICIPANTS = "SELECT * FROM participant WHERE (documentid = :documentId) ";
    // language=SQL
    public static  final String ADD_PARTICIPANT =
            "INSERT INTO participant VALUES (:id, :fullName, :education, :placeOfWork, :positionAtWork, :documentId)";

    static final RowMapper<Participant> PARTICIPANTS_ROW_MAPPER = new RowMapper<Participant>() {
        @Override
        public Participant mapRow(ResultSet resultSet, int i) throws SQLException {
            try {
                return new Participant(resultSet.getInt("participantId"),resultSet.getInt("userId"),
                        resultSet.getBoolean("isIE"), resultSet.getString("nameOfEntity"),
                        resultSet.getString("idOfTaxpayer"), resultSet.getString("location"), 
                        resultSet.getString("mainStateRegistrationNumber"), resultSet.getString("nameOfIE"), 
                        resultSet.getString("surnameOfIE"), resultSet.getString("patronymicodIE"));
            } catch (SQLException e) {
                throw new IllegalArgumentException(e);
            }
        }
    };

    @Override
    public void addParticipant(Participant participants) {
        daoArgumentsVerifier.verifyParticipant(participants.getParticipantId());
        Map<String,Object> paramMap = paramsMapper.asMap(
                asList("participantId", "userId", "isIE", "nameOfEntity",
                        "idOfTaxpayer", "location", "mainStateRegistartionNumber", "nameOfIE",
                        "surnameOfIE", "patronymicOfIE"),
                asList(participants.getParticipantId(), participants.getUserId(),
                        participants.isIE(), participants.getNameOfEntity(), participants.getIdOfTaxpayer(),
                        participants.getLocation(), participants.getMainStateRegistrationNumber(), participants.getNameOfIE(),
                        participants.getSurnameOfIE(), participants.getPatronymicOfIE()));
        sqlQueryExecutor.updateQuery(ADD_PARTICIPANT, paramMap);

    }

    @Override
    public void destroy(int id) {

    }

    @Override
    public Participant getParticipantById(int id) {
        return null;
    }

    @Override
    public List<Participant> getParticipants(int participantId) {
        daoArgumentsVerifier.verifyParticipant(participantId);
        return sqlQueryExecutor.queryForObjects(GET_PARTICIPANTS, PARTICIPANTS_ROW_MAPPER);
    }

    @Override
    public Participant getParticipantByDocument(int id) {
        return null;
    }
}

