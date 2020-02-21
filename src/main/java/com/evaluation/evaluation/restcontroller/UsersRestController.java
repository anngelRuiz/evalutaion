package com.evaluation.evaluation.restcontroller;

import com.evaluation.evaluation.models.Users;
import com.evaluation.evaluation.services.UsersServices;
import com.evaluation.evaluation.utils.UrlConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(UrlConstants.USERS)
public class UsersRestController {

    @Autowired
    UsersServices usersServices;

    @GetMapping(UrlConstants.USERS_LIST)
    public List<Users> list(){
        return usersServices.list();
    }

    @PostMapping(UrlConstants.USERS_ADD)
    public void addUser(@RequestBody Users user){
        usersServices.add(user);
    }

    @DeleteMapping(UrlConstants.USERS_DELETE)
    public void deleteUser(@PathVariable int id){
        usersServices.remove(id);
    }

    @PutMapping(UrlConstants.USERS_EDIT)
    public void editUser(@PathVariable int id, @RequestBody Users user){
        usersServices.update(user, id);
    }
}
