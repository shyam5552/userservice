package com.myjavalife.userservice.service;

import com.myjavalife.userservice.model.User;
import com.myjavalife.userservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public void saveuser(User user) {
        userRepository.save(user);

    }

    public List<User> getallusers() {
        return userRepository.findAll();
    }

    public User getuser(String username) {
        return userRepository.findById(username).get();
    }

    public void updateuser(User user) {
        userRepository.save(user);
    }

    public void deleteuser(String username) {
        userRepository.deleteById(username);
    }
}
