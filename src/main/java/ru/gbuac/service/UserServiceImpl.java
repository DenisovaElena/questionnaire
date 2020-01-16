package ru.gbuac.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import ru.gbuac.dao.UserRepository;
import ru.gbuac.model.User;
import ru.gbuac.util.exception.NotFoundException;

import java.util.List;

import static ru.gbuac.util.ValidationUtil.checkNotFoundWithId;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User get(int id) throws NotFoundException {
        return checkNotFoundWithId(userRepository.findById(id).orElse(null), id);
    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public User save(User user) {
        Assert.notNull(user, "user must not be null");
        return userRepository.save(user);
    }

    @Override
    public User update(User user, int id) throws NotFoundException {
        Assert.notNull(user, "user must not be null");
        User savedUser = checkNotFoundWithId(userRepository.save(user), id);
        return savedUser;
    }

    @Override
    public void delete(int name) throws NotFoundException {
        userRepository.delete(name);
    }

    @Override
    public User getByName(String name) {
        return userRepository.getByName(name);
    }

    @Override
    public void deleteByName(String name) {
        userRepository.deleteByName(name);
    }
}
