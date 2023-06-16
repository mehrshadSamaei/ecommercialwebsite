package com.example.ecommercialwithservlet;

import com.example.ecommercialwithservlet.entity.UsersEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.lang.reflect.Field;

public class UserTest {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("bookStoreWebsite");
        EntityManager em = emf.createEntityManager();
//        User user = new User();
//        user.setEmail("test1@gmail.com");
//        user.setFullName("test testiiii");
//        user.setPassword("test123456");

        UsersEntity user = new UsersEntity();
        Field email = user.getClass().getDeclaredField("email");
        email.setAccessible(true);
        email.set(user, "refTest@Gmail.com");
        Field fullName = user.getClass().getDeclaredField("fullName");
        fullName.setAccessible(true);
        fullName.set(user, "test testttttref");
        Field password = user.getClass().getDeclaredField("password");
        password.setAccessible(true);
        password.set(user, "123456789");


        em.getTransaction().begin();
        em.persist(user);
        em.getTransaction().commit();
        em.close();
        emf.close();


        System.out.println(" a user obj persist");


    }
}
