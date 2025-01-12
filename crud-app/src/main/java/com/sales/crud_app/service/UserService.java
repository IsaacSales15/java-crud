package com.sales.crud_app.service;

import com.sales.crud_app.model.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.ArrayList;

@Service
public class UserService {
    private final List<User> users = new ArrayList<>();
    private Long nextId = 1L;

    public List<User> getAllUsers() {
        return users;
    }

    public User getUserById(Long id) {
        return users.stream().filter(users->users.getId().equals(id)).findFirst().orElse(null);
    }
    
    public User creatUser(User user) {
        user.setId(nextId++);
        users.add(user);
        return user;
    }

    public boolean deleteUser(Long id) {
        return users.removeIf(user->user.getId().equals(id));
    }

}
