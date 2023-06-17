package com.example.ecommercialwithservlet.dao;

import com.example.ecommercialwithservlet.entity.UsersEntity;

import javax.persistence.EntityManager;
import java.util.List;

public class UserDAO extends JpaDAO<UsersEntity> implements GenericDAO<UsersEntity>{

    public UserDAO(EntityManager em) {
        super(em);
    }

    @Override
    public UsersEntity create(UsersEntity usersEntity) {
        return super.create(usersEntity);
    }

    @Override
    public UsersEntity update(UsersEntity usersEntity) {
        return null;
    }

    @Override
    public UsersEntity get(Object id) {
        return null;
    }

    @Override
    public void deleteById(Object id) {

    }

    @Override
    public List<UsersEntity> listAll() {
        return null;
    }

    @Override
    public Long count() {
        return null;
    }
}
