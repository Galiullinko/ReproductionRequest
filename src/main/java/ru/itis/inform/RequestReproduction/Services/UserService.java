package ru.itis.inform.RequestReproduction.services;

import ru.itis.inform.RequestReproduction.dao.models.User;

import java.util.List;

/**
 * Created by Galiullin_ko on 20/04/16.
 */
public interface UserService {
    User getUserById(int id);
    void addUser(User user);
}
