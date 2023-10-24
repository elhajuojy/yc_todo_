package ma.yc.todo_application.dto;

import ma.yc.todo_application.entites.TodoEntity;

import java.util.Collection;

public interface TodoDao {

    public boolean addNewTodoToUser(TodoEntity todo);
    public boolean deleteTodoById(Long id);
    public boolean updateTodoById(Long id, String description);
    public Collection<TodoEntity> getAllTodos();
    public Collection<TodoEntity> getAllTodosByUserId(Long id);


}
