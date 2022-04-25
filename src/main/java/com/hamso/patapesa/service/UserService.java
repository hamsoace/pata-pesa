package com.hamso.patapesa.service;

import com.hamso.patapesa.models.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    public User addUser(User user);

   public List<User> getAllUsers();

    public List<User> getUser();

//    void deleteUser(int id);

    public void getAmount();
}
