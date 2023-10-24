package ma.yc.todo_application.service.impl;

import ma.yc.todo_application.dto.TodoDao;
import ma.yc.todo_application.dto.impl.TodoDaoImpl;
import ma.yc.todo_application.entites.TodoEntity;
import ma.yc.todo_application.enums.Status;
import ma.yc.todo_application.service.TodoService;

import java.util.Collection;

public class TodoServiceImpl implements TodoService {
    private TodoDao todoDao ;

    public TodoServiceImpl() {
        this.todoDao = new TodoDaoImpl();
    }

    @Override
    public boolean addTodo(TodoEntity todo) {
        if (todo.getDescription().isEmpty() || todo.getTitle().isEmpty()){
            return  false;
        }else{
            todo.setStatus(Status.Todo);
            return todoDao.addNewTodoToUser(todo);
        }

    }

    @Override
    public boolean update(TodoEntity todo) {

        return false;
    }

    @Override
    public boolean remove(TodoEntity todo) {
        return false;
    }

    @Override
    public Collection<TodoEntity> findAll() {
        return todoDao.getAllTodos();
    }

    @Override
    public TodoEntity findById(Long id) {
        return null;
    }
}
