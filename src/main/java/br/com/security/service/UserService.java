package br.com.security.service;

import br.com.security.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUser();

    User createUser(User user);

    User updateUser(long id, User user);

    void deleteUser(long id);

    User getUserById(long id);
}
