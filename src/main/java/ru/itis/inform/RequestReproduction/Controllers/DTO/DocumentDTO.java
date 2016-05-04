package ru.itis.inform.RequestReproduction.controllers.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import ru.itis.inform.RequestReproduction.dao.models.Document;

import java.util.Date;

/**
 * Created by Galiullin_ko on 20/04/16.
 */
public class DocumentDTO {
    private int documentId;
    private int participantId;
    private int yearOfWorks;
    private String goal;
    private Date dateOfEndOfTheWork;
    private String stateOfCreature;
    private String typeOfCreature;
    private int numberOfCreatures;
    private String nameOfWorkLocation;
    private int averegePieceOfWaterResources;
    private int weightOfCreatures;
    private String sourceOfResources;
    private Date dateOfFillingTheDocument;
    private String nameOfEntity;
    private String idOfTaxpayer;
    private String locationOfParticipant;
    private String mainStateRegistrationNumber;
    private String nameOfIE;
    private String surnameOfIE;
    private String patronymicOfIE;

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
        this.nameOfEntity = document.getNameOfEntity();
        this.idOfTaxpayer = document.getIdOfTaxpayer();
        this.locationOfParticipant = document.getLocationOfParticipant();
        this.mainStateRegistrationNumber = document.getMainStateRegistrationNumber();
        this.nameOfIE = document.getNameOfIE();
        this.surnameOfIE = document.getSurnameOfIE();
        this.patronymicOfIE = document.getPatronymicOfIE();
    }

    public int getDocumentId() {
        return documentId;
    }

    public void setDocumentId(int documentId) {
        this.documentId = documentId;
    }

    public int getParticipantId() {
        return participantId;
    }

    public void setParticipantId(int participantId) {
        this.participantId = participantId;
    }

    public int getYearOfWorks() {
        return yearOfWorks;
    }

    public void setYearOfWorks(int yearOfWorks) {
        this.yearOfWorks = yearOfWorks;
    }

    public String getGoal() {
        return goal;
    }

    public void setGoal(String goal) {
        this.goal = goal;
    }

    public Date getDateOfEndOfTheWork() {
        return dateOfEndOfTheWork;
    }

    public void setDateOfEndOfTheWork(Date dateOfEndOfTheWork) {
        this.dateOfEndOfTheWork = dateOfEndOfTheWork;
    }

    public String getStateOfCreature() {
        return stateOfCreature;
    }

    public void setStateOfCreature(String stateOfCreature) {
        this.stateOfCreature = stateOfCreature;
    }

    public String getTypeOfCreature() {
        return typeOfCreature;
    }

    public void setTypeOfCreature(String typeOfCreature) {
        this.typeOfCreature = typeOfCreature;
    }

    public int getNumberOfCreatures() {
        return numberOfCreatures;
    }

    public void setNumberOfCreatures(int numberOfCreatures) {
        this.numberOfCreatures = numberOfCreatures;
    }

    public String getNameOfWorkLocation() {
        return nameOfWorkLocation;
    }

    public void setNameOfWorkLocation(String nameOfWorkLocation) {
        this.nameOfWorkLocation = nameOfWorkLocation;
    }

    public int getAveregePieceOfWaterResources() {
        return averegePieceOfWaterResources;
    }

    public void setAveregePieceOfWaterResources(int averegePieceOfWaterResources) {
        this.averegePieceOfWaterResources = averegePieceOfWaterResources;
    }

    public int getWeightOfCreatures() {
        return weightOfCreatures;
    }

    public void setWeightOfCreatures(int weightOfCreatures) {
        this.weightOfCreatures = weightOfCreatures;
    }

    public String getSourceOfResources() {
        return sourceOfResources;
    }

    public void setSourceOfResources(String sourceOfResources) {
        this.sourceOfResources = sourceOfResources;
    }

    public Date getDateOfFillingTheDocument() {
        return dateOfFillingTheDocument;
    }

    public void setDateOfFillingTheDocument(Date dateOfFillingTheDocument) {
        this.dateOfFillingTheDocument = dateOfFillingTheDocument;
    }

    public String getNameOfEntity() {
        return nameOfEntity;
    }

    public void setNameOfEntity(String nameOfEntity) {
        this.nameOfEntity = nameOfEntity;
    }

    public String getIdOfTaxpayer() {
        return idOfTaxpayer;
    }

    public void setIdOfTaxpayer(String idOfTaxpayer) {
        this.idOfTaxpayer = idOfTaxpayer;
    }

    public String getLocationOfParticipant() {
        return locationOfParticipant;
    }

    public void setLocationOfParticipant(String locationOfParticipant) {
        this.locationOfParticipant = locationOfParticipant;
    }

    public String getMainStateRegistrationNumber() {
        return mainStateRegistrationNumber;
    }

    public void setMainStateRegistrationNumber(String mainStateRegistrationNumber) {
        this.mainStateRegistrationNumber = mainStateRegistrationNumber;
    }

    public String getNameOfIE() {
        return nameOfIE;
    }

    public void setNameOfIE(String nameOfIE) {
        this.nameOfIE = nameOfIE;
    }

    public String getSurnameOfIE() {
        return surnameOfIE;
    }

    public void setSurnameOfIE(String surnameOfIE) {
        this.surnameOfIE = surnameOfIE;
    }

    public String getPatronymicOfIE() {
        return patronymicOfIE;
    }

    public void setPatronymicOfIE(String patronymicOfIE) {
        this.patronymicOfIE = patronymicOfIE;
    }
}
