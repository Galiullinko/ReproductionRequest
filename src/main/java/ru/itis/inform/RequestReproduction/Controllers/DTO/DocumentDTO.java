package ru.itis.inform.RequestReproduction.Controllers.DTO;

import com.fasterxml.jackson.annotation.JsonInclude;
import ru.itis.inform.RequestReproduction.DAO.Models.Document;
import ru.itis.inform.RequestReproduction.DAO.Models.Goal;
import ru.itis.inform.RequestReproduction.DAO.Models.Participant;

import java.util.Date;

/**
 * Created by Galiullin_ko on 20/04/16.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DocumentDTO {
    private int documentId;
    private int participantId;
    private int yearOfWorks;
    private Goal goal;
    private Date dateOfEndOfTheWork;

    private String stateOfCreature;
    private String typeOfCreature;
    private int numberOfCreatures;
    private String nameOfWorkLocation;
    private int averegePieceOfWaterResources;
    private int weightOfCreatures;
    private String sourceOfResources;
    private Date dateOfFillingTheDocument;

    public DocumentDTO(Document document) {
        this.documentId = document.getDocumentId();
        this.participantId = document.getParticipantId();
        this.yearOfWorks = document.getYearOfWorks();
        this.goal = document.getGoal();
        this.dateOfEndOfTheWork = document.getDateOfEndOfTheWork();
        this.stateOfCreature = document.getStateOfCreature();
        this.typeOfCreature = document.getTypeOfCreature();
        this.numberOfCreatures = document.getNumberOfCreatures();
        this.nameOfWorkLocation = document.getNameOfWorkLocation();
        this.averegePieceOfWaterResources = document.getAveregePieceOfWaterResources();
        this.weightOfCreatures = document.getWeightOfCreatures();
        this.sourceOfResources = document.getSourceOfResources();
        this.dateOfFillingTheDocument = document.getDateOfFillingTheDocument();
    }

    public int getDocumentId() {
        return documentId;
    }

    public int getParticipantId() {
        return participantId;
    }

    public int getYearOfWorks() {
        return yearOfWorks;
    }

    public Goal getGoal() {
        return goal;
    }

    public Date getDateOfEndOfTheWork() {
        return dateOfEndOfTheWork;
    }

    public String getStateOfCreature() {
        return stateOfCreature;
    }

    public String getTypeOfCreature() {
        return typeOfCreature;
    }

    public int getNumberOfCreatures() {
        return numberOfCreatures;
    }

    public String getNameOfWorkLocation() {
        return nameOfWorkLocation;
    }

    public int getAveregePieceOfWaterResources() {
        return averegePieceOfWaterResources;
    }

    public int getWeightOfCreatures() {
        return weightOfCreatures;
    }

    public String getSourceOfResources() {
        return sourceOfResources;
    }

    public Date getDateOfFillingTheDocument() {
        return dateOfFillingTheDocument;
    }

}
