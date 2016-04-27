package ru.itis.inform.RequestReproduction.controllers.dto;

import ru.itis.inform.RequestReproduction.dao.models.Token;

/**
 * Created by Galiullin_ko on 26/04/16.
 */
public class TokenDTO {
    private int userId;
    private String token;

    public TokenDTO(Token token) {
        this.userId = token.getUserId();
        this.token = token.getToken();
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

}
