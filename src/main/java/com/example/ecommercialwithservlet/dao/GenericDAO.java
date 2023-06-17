package com.example.ecommercialwithservlet.dao;
import java.util.List;


public interface GenericDAO<T> {
    T create(T t);

    T update(T t);

    T get(Object id);

    void deleteById(Object id);

    List<T> listAll();

    Long count();


}
