package com.example.user_api.Controller;

import com.example.user_api.DTO.UserDTO;
import com.example.user_api.UserApiApplication;
import org.apache.catalina.User;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
public class UserController {

    @GetMapping("/users")
    public List<UserDTO> getUser(){
        return UserApiApplication.users;
    };

    @GetMapping("/users/{cpf}")
    public UserDTO getUserById(@PathVariable String cpf) {
        for (UserDTO userDTO : UserApiApplication.users ) {
            if(userDTO.getCpf().equals(cpf)){
                return userDTO;
            }
        }
        return null;
    }

    @PostMapping("/user")
    public UserDTO postUser(@RequestBody UserDTO user) {
     user.setDateRegister(new Date());
     UserApiApplication.users.add(user);

     return user;
    }

    @DeleteMapping("/remove-user/{cpf}")
    public void deleteUser(@PathVariable String cpf) {
        for (UserDTO userDTO : UserApiApplication.users) {
            if (userDTO.getCpf().equals(cpf)) {
                UserApiApplication.users.remove(cpf);
            }
        }
    }
}
