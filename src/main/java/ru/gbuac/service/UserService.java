package ru.gbuac.service;

import ru.gbuac.model.User;
import ru.gbuac.util.exception.NotFoundException;

import java.util.List;

public interface UserService {

    User get(int id) throws NotFoundException;

    List<User> getAll();

    User save(User user);

    User update(User user, int id) throws NotFoundException;

    void delete(int name) throws NotFoundException;

    User getByName(String name);

    void deleteByName(String name);
}
