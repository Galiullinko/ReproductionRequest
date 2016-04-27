package ru.itis.inform.RequestReproduction.controllers.dto;

import ru.itis.inform.RequestReproduction.dao.models.User;

/**
 * Created by Galiullin_ko on 25/04/16.
 */
public class UserDTO {
    private int userId;
    private String name;
    private String surname;
    private String patronymic;
    private String seriesOfThePassport;
    private String numberOfThePassport;
    private String phoneNumber;
    private String email;

    public UserDTO(User user) {
        this.userId = user.getUserId();
        this.name = user.getName();
        this.surname = user.getSurname();
        this.patronymic = user.getPatronymic();
        this.seriesOfThePassport = user.getSeriesOfThePassport();
        this.numberOfThePassport = user.getNumberOfThePassport();
        this.phoneNumber = user.getPhoneNumber();
        this.email = user.getEmail();
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getSeriesOfThePassport() {
        return seriesOfThePassport;
    }

    public void setSeriesOfThePassport(String seriesOfThePassport) {
        this.seriesOfThePassport = seriesOfThePassport;
    }

    public String getNumberOfThePassport() {
        return numberOfThePassport;
    }

    public void setNumberOfThePassport(String numberOfThePassport) {
        this.numberOfThePassport = numberOfThePassport;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
