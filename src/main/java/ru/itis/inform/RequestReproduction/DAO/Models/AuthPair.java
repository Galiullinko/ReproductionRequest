package ru.itis.inform.RequestReproduction.DAO.Models;

import java.util.Objects;

/**
 * Created by Galiullin_ko on 25/04/16.
 */
public class AuthPair {
    private int userId;
    private String login;
    private String password;

    public AuthPair (int userId, String login, String password) {
        this.userId = userId;
        this.login = login;
        this.password = password;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass())
            return false;

        AuthPair that = (AuthPair) obj;
        return Objects.equals(this.getUserId(), that.getUserId()) &&
                Objects.equals(this.getLogin(), that.getLogin()) &&
                Objects.equals(this.getPassword(), that.getPassword());
    }
    @Override
    public int hashCode() {
        return Objects.hash(this.getUserId(), this.getLogin(), this.getPassword());
    }

    @Override
    public String toString() {
        return "AuthPair {" +
                "userId=" + userId +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
