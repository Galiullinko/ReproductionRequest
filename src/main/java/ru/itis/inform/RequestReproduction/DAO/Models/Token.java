package ru.itis.inform.RequestReproduction.dao.models;

import java.util.Objects;

/**
 * Created by Galiullin_ko on 25/04/16.
 */
public class Token {
    private int userId;
    private String token;

    public Token(int userId, String token) {
        this.userId = userId;
        this.token = token;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass())
            return false;

        Token that = (Token) obj;
        return Objects.equals(this.getUserId(), that.getUserId()) &&
                Objects.equals(this.getToken(), that.getToken());
    }
    @Override
    public int hashCode() {
        return Objects.hash(this.getUserId(), this.getToken());
    }

    @Override
    public String toString() {
        return "Token {" +
                "userId=" + userId +
                ", token='" + token + '\'' +
                '}';
    }
}
