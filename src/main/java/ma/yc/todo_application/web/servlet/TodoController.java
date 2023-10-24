package ma.yc.todo_application.web.servlet;

import jakarta.persistence.Entity;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import ma.yc.todo_application.entites.TodoEntity;
import ma.yc.todo_application.entites.UserEntity;
import ma.yc.todo_application.service.TodoService;
import ma.yc.todo_application.service.impl.TodoServiceImpl;

import java.io.IOException;
import java.util.Collection;

@WebServlet(name = "TodoController", value = "/Todo")
public class TodoController  extends HttpServlet {

    private TodoService todoService;
    private Collection<TodoEntity> todoEntities ;
    @Override
    public void init() throws ServletException {
        this.todoService = new TodoServiceImpl();

        super.init();

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO: 24/10/2023
        this.todoEntities = this.todoService.findAll();
        req.setAttribute("todos", this.todoEntities);
        req.getRequestDispatcher("WEB-INF/Todo.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        TodoEntity todo = new TodoEntity();
        UserEntity user = new UserEntity();
        todo.setDescription((String) req.getParameter("description"));
        todo.setTitle((String) req.getParameter("title"));
//        Long id =Long.parseLong(req.getParameter("user_id"));
//        user.setId(id);
//        todo.setUser(user);
        this.todoService.addTodo(todo);
        this.todoEntities = this.todoService.findAll();
        req.setAttribute("todos", this.todoEntities);
        req.getRequestDispatcher("WEB-INF/Todo.jsp").forward(req,resp);



    }
 }
