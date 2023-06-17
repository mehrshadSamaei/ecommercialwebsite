package com.example.ecommercialwithservlet.test;

import com.example.ecommercialwithservlet.dao.EntityManagerFactorySingleton;
import com.example.ecommercialwithservlet.dao.JpaDAO;
import com.example.ecommercialwithservlet.dao.UserDAO;
import com.example.ecommercialwithservlet.entity.UsersEntity;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.assertTrue;

class UserDAOTest {

    private static EntityManagerFactory emf;

    private static EntityManager em;


    private static UserDAO userRepository;


    @BeforeClass
    public static void setUpClass() {
        if (em == null)
            em = EntityManagerFactorySingleton.getEmf().createEntityManager();

        if (userRepository == null)
            userRepository = new UserDAO(em);
    }

    @Test
    void createdUse() throws NoSuchFieldException, IllegalAccessException {


        UsersEntity user = new UsersEntity();
        Field email = user.getClass().getDeclaredField("email");

        email.setAccessible(true);

        email.set(user, "mehrshad@gmail.com");

        Field password = user.getClass().getDeclaredField("password");
        password.setAccessible(true);

        password.set(user, "m123456");


        Field fullName = user.getClass().getDeclaredField("fullName");
        fullName.setAccessible(true);
        fullName.set(user, "mehrshad samaei");

        user = userRepository.create(user);


        assertTrue(user.getUserId() > 0);
    }

    @AfterClass
    public static void tearDownClass() {
//        em.close();
//        emf.close();
    }
}