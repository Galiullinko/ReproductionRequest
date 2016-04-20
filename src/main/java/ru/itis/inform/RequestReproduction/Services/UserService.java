package ru.itis.inform.RequestReproduction.Services;

import ru.itis.inform.RequestReproduction.DAO.Models.User;

import java.util.List;

/**
 * Created by Galiullin_ko on 20/04/16.
 */
public interface UserService {
    User getUserById(int id);
    List<User> getUsers();
}
