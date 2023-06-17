package com.example.ecommercialwithservlet.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaDAO<T> {


    protected final EntityManagerFactory emf;
    protected EntityManager entityManager;

    public JpaDAO(EntityManager em) {
        this.emf = EntityManagerFactorySingleton.getEmf();
        em = emf.createEntityManager();
        entityManager = em;
    }


    public EntityManager getEntityManager() {
        if (entityManager == null)
            emf.createEntityManager();
        return entityManager;
    }

    public T create(T t) {
        entityManager = emf.createEntityManager();
        getEntityManager().getTransaction().begin();
        getEntityManager().persist(t);
        getEntityManager().flush();
        getEntityManager().refresh(t);
        getEntityManager().getTransaction().commit();

        return t;
    }

}
