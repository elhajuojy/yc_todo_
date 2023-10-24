package ma.yc.todo_application.service.impl;

import ma.yc.todo_application.entites.UserEntity;
import ma.yc.todo_application.service.UserService;

import java.util.Collection;

public class UserServiceImpl implements UserService {
    @Override
    public boolean addTodo(UserEntity todo) {
        return false;
    }

    @Override
    public boolean update(UserEntity todo) {
        return false;
    }

    @Override
    public boolean remove(UserEntity todo) {
        return false;
    }

    @Override
    public Collection<UserEntity> findAll() {
        return null;
    }

    @Override
    public UserEntity findById(Long id) {
        return null;
    }
}
