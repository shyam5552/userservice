package com.myjavalife.userservice.controller;

import com.myjavalife.userservice.model.User;
import com.myjavalife.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping(value = "/users")
    public String saveuser(@RequestBody User user){
        userService.saveuser(user);
        return "user saved";

    }
    @GetMapping(value = "/users")
    public List<User> getallusers(){
        return userService.getallusers();
    }
    @GetMapping(value = "/users/{username}")
    public User getuser(@PathVariable String username){
       return userService.getuser(username);
    }
    @PutMapping(value = "/users/{username}")
    public String updateuser(@PathVariable String username,@RequestBody User user){
        userService.updateuser(user);
        return "user updated";
    }
    @DeleteMapping(value = "/users/{username}")
    public String deleteuser(@PathVariable String username){
        userService.deleteuser(username);
        return "user deleated";
    }
}
