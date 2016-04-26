package ru.itis.inform.RequestReproduction.controllers.dto;

import ru.itis.inform.RequestReproduction.dao.models.AuthPair;

/**
 * Created by Galiullin_ko on 25/04/16.
 */
public class AuthPairDTO {
    private int userId;
    private String login;
    private String password;

    public AuthPairDTO(AuthPair auth) {
        this.userId = auth.getUserId();
        this.login = auth.getLogin();
        this.password = auth.getPassword();
    }

    public int getUserId() {
        return userId;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
}
