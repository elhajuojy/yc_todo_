package ma.yc.todo_application.service;

import ma.yc.todo_application.entites.TodoEntity;

import java.util.Collection;

public interface TodoService {
    public boolean addTodo(TodoEntity todo);
    public boolean update(TodoEntity todo);
    public boolean remove(TodoEntity todo);
    public Collection<TodoEntity> findAll();
    public TodoEntity findById(Long id);

}
