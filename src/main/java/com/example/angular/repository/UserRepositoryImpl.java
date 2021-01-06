package com.example.angular.repository;

import com.example.angular.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;
@Transactional
@Repository
public class UserRepositoryImpl  implements UserRepository{
    @PersistenceContext
    private EntityManager em;

    @Override
    public User findById(Long id) {
        TypedQuery<User> query= em.createQuery("select c from User c where c.id=?1",User.class );
        query.setParameter(1, id);
        try {
            return query.getSingleResult();
        }catch (NoResultException e){
            return null;
        }
    }

    @Override
    public List<User> findAll() {
        TypedQuery<User> query = em.createQuery("select c from User c ", User.class);
        return query.getResultList();
    }

    @Override
    public User save(User model) {
        if (model.getId() != null){
          return   em.merge(model);
        }
         em.persist(model);
        return model;
    }

    @Override
    public void remove(Long id) {
        User user= findById(id);
        if(user!=null){
            em.remove(user);
        }
    }
}
