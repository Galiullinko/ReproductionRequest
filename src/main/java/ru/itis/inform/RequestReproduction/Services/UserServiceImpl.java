package ru.itis.inform.RequestReproduction.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.itis.inform.RequestReproduction.dao.models.User;
import ru.itis.inform.RequestReproduction.dao.users.UserDAO;

import java.util.List;

/**
 * Created by Galiullin_ko on 20/04/16.
 */
@Component
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDAO userDAO;

    @Override
    public User getUserById(int id) {
        return userDAO.getUser(id);
    }

    @Override
    public void addUser(User user) {
        userDAO.addUser(user);
    }
}
