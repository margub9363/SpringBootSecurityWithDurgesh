package com.example.springbootsecurity.services;

import com.example.springbootsecurity.models.User;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class UserService {

    public List<User> list = new LinkedList<>();

    public UserService() {
        list.add(new User("abc","abc","abc@abc.com"));
        list.add(new User("xyz","xyz","xyz@xyz.com"));
    }

//    get all users
    public List<User> getAllUsers(){
        return this.list;
    }

//    get single user
    public User getUser(String userName){
        return this.list.stream().filter( e-> e.getUserName().equals(userName)).findAny().orElse(null);
    }

//    adding a user
    public User addUser(User user){
        this.list.add(user);
        return user;
    }
}
