package ru.itis.inform.RequestReproduction.Controllers.DTO;

import com.fasterxml.jackson.annotation.JsonInclude;
import ru.itis.inform.RequestReproduction.DAO.Models.Participant;

/**
 * Created by Galiullin_ko on 20/04/16.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ParticipantDTO {
    private int userId;
    private boolean isIE;
    private String nameOfEntity;
    private String idOfTaxpayer;
    private String location;
    private String mainStateRegistrationNumber;
    private String nameOfIE; //IE - индивидуальный предприниматель
    private String surnameOfIE;
    private String patronymicOfIE;

    public ParticipantDTO(Participant participant) {
        this.userId = participant.getUserId();
        this.isIE = participant.isIE();
        this.nameOfEntity = participant.getNameOfEntity();
        this.idOfTaxpayer = participant.getIdOfTaxpayer();
        this.location = participant.getLocation();
        this.mainStateRegistrationNumber = participant.getMainStateRegistrationNumber();
        this.nameOfIE = participant.getNameOfIE();
        this.surnameOfIE = participant.getSurnameOfIE();
        this.patronymicOfIE = participant.getPatronymicOfIE();
    }

    public int getUserId() {
        return userId;
    }

    public boolean isIE() {
        return isIE;
    }

    public String getNameOfEntity() {
        return nameOfEntity;
    }

    public String getIdOfTaxpayer() {
        return idOfTaxpayer;
    }

    public String getLocation() {
        return location;
    }

    public String getMainStateRegistrationNumber() {
        return mainStateRegistrationNumber;
    }

    public String getNameOfIE() {
        return nameOfIE;
    }

    public String getSurnameOfIE() {
        return surnameOfIE;
    }

    public String getPatronymicOfIE() {
        return patronymicOfIE;
    }
}
