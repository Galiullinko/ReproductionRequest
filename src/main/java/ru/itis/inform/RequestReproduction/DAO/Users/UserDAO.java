package ru.itis.inform.RequestReproduction.dao.users;

import ru.itis.inform.RequestReproduction.dao.models.User;

/**
 * Created by Galiullin_ko on 09/04/16.
 */
public interface UserDAO {
    User getUser(int userId);
    void addUser(User user);
}
