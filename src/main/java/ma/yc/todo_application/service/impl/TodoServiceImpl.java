package ma.yc.todo_application.service.impl;

import jakarta.persistence.EntityManager;
import ma.yc.todo_application.connection.Jpa;
import ma.yc.todo_application.entites.TodoEntity;
import ma.yc.todo_application.entites.UserEntity;
import ma.yc.todo_application.enums.Status;
import ma.yc.todo_application.service.TodoService;

import java.util.Collection;

public class TodoServiceImpl implements TodoService {
    EntityManager em = Jpa.getInstance().getEntityManager();
    @Override
    public boolean addTodo(TodoEntity todo) {
        if (todo.getDescription().isEmpty() || todo.getTitle().isEmpty()){
            return  false;
        }else{
            em.getTransaction().begin();
            try{

//                UserEntity user = em.find(UserEntity.class, todo.getUser().getId());
//                em.persist(user);
                em.persist(todo);
                todo.setStatus(Status.Todo);
                em.getTransaction().commit();

            }catch (Exception e){
                System.out.println(e.toString());
                em.getTransaction().rollback();

            }
            return true;
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
        String HQL = " FROM TodoEntity v";

        return em.createQuery(HQL , TodoEntity.class).getResultList();



    }

    @Override
    public TodoEntity findById(Long id) {
        return null;
    }
}
