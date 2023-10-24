package ma.yc.todo_application.dto.impl;

import jakarta.persistence.EntityManager;
import ma.yc.todo_application.connection.Jpa;
import ma.yc.todo_application.dto.TodoDao;
import ma.yc.todo_application.entites.TodoEntity;

import java.util.Collection;

public class TodoDaoImpl implements TodoDao {
    EntityManager em = Jpa.getInstance().getEntityManager();
    @Override
    public boolean addNewTodoToUser(TodoEntity todo) {
        try{
            em.getTransaction().begin();
            em.persist(todo);
            em.getTransaction().commit();
            return true;
        }catch (Exception e){
            em.getTransaction().rollback();
        }

        return false;
    }

    @Override
    public boolean deleteTodoById(Long id) {
        return false;
    }

    @Override
    public boolean updateTodoById(Long id, String description) {
        return false;
    }

    @Override
    public Collection<TodoEntity> getAllTodos() {
        String HQL = " FROM TodoEntity v";
        return em.createQuery(HQL , TodoEntity.class).getResultList();
    }

    @Override
    public Collection<TodoEntity> getAllTodosByUserId(Long id) {
        return null;
    }
}
