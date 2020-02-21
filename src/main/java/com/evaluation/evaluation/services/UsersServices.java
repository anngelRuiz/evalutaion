package com.evaluation.evaluation.services;

import com.evaluation.evaluation.models.Users;
import com.evaluation.evaluation.repository.CRUD;
import com.evaluation.evaluation.repository.UsersRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UsersServices extends CRUD<Users, UsersRepository> {

    public UsersServices(UsersRepository repository) {
        super(repository);
    }

    @Override
    public List<Users> list() {
        return respository.findAll();
    }

    @Override
    public Users get(int id) {
        return respository.findById(id).get();
    }

    @Override
    public void add(Users o) {
        respository.save(o);
    }

    @Override
    public void update(Users o, int id) {
        o.setId(id);
        respository.save(o);
    }

    @Override
    public void remove(int id) {
        respository.deleteById(id);
    }

}
