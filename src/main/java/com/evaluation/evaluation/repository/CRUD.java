package com.evaluation.evaluation.repository;

import java.util.List;

public abstract class CRUD<T, E> {

    protected  E respository;

    public CRUD(E respository) {
        this.respository = respository;
    }

    public abstract List<T> list();
    public abstract T get(int id);
    public abstract void add(T o);
    public abstract void update(T o, int id);
    public abstract void remove(int id);
}
