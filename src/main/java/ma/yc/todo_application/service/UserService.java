package ma.yc.todo_application.service;

import ma.yc.todo_application.entites.UserEntity;

import java.util.Collection;

public interface UserService {
    public boolean addTodo(UserEntity todo);
    public boolean update(UserEntity todo);
    public boolean remove(UserEntity todo);
    public Collection<UserEntity> findAll();
    public UserEntity findById(Long id);

}
