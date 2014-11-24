package com.springapp.services;

import com.springapp.domain.User;
import java.util.List;

/**
 * Created by Nastya on 17.11.2014.
 */
public interface IUserService {
    List<User> getAll();
    void updateUser(User user);
    void deleteUser(Long id);
    void addUser(User user);

}
