package com.example.ecommercialwithservlet.dao;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFactorySingleton {
    private static EntityManagerFactory emf;

    private EntityManagerFactorySingleton() {
    }

    public static EntityManagerFactory getEmf() {
        if (emf == null)
           emf = Persistence.createEntityManagerFactory("bookStoreWebsite");
        return emf;
    }
}
