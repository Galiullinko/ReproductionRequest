package ru.itis.inform.RequestReproduction.DAO.Models;

import java.util.Date;

/**
 * Created by Galiullin_ko on 07/04/16.
 */
public class Document {
    private int document_id;

    public int getDocument_id() {
        return document_id;
    }

    public void setDocument_id(int document_id) {
        this.document_id = document_id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    private int userId;
    private int yearOfWorks;
    private Goals goal;
    private Date dateOfEndOfTheWork;
    private String stateOfCreature;
    private String typeOfCreature;
    private int numberOfCreatures;
    private String nameOfWorkLocation;
    private int averegePieceOfWaterResources;
    private int weightOfCreatures;
    private String sourceOfResources;
    private Date dateOfFillingTheApplication;

    public int getYearOfWorks() {
        return yearOfWorks;
    }

    public void setYearOfWorks(int yearOfWorks) {
        this.yearOfWorks = yearOfWorks;
    }

    public Goals getGoal() {
        return goal;
    }

    public void setGoal(Goals goal) {
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

    public Date getDateOfFillingTheApplication() {
        return dateOfFillingTheApplication;
    }

    public void setDateOfFillingTheApplication(Date dateOfFillingTheApplication) {
        this.dateOfFillingTheApplication = dateOfFillingTheApplication;
    }

    @Override
    public String toString() {
        return "Document{" +
                "document_id=" + document_id +
                ", userId=" + userId +
                ", yearOfWorks=" + yearOfWorks +
                ", goal=" + goal +
                ", dateOfEndOfTheWork=" + dateOfEndOfTheWork +
                ", stateOfCreature='" + stateOfCreature + '\'' +
                ", typeOfCreature='" + typeOfCreature + '\'' +
                ", numberOfCreatures=" + numberOfCreatures +
                ", nameOfWorkLocation='" + nameOfWorkLocation + '\'' +
                ", averegePieceOfWaterResources=" + averegePieceOfWaterResources +
                ", weightOfCreatures=" + weightOfCreatures +
                ", sourceOfResources='" + sourceOfResources + '\'' +
                ", dateOfFillingTheApplication=" + dateOfFillingTheApplication +
                '}';
    }
}
