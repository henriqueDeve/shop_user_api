package com.example.user_api.Controller;

import com.example.user_api.DTO.UserDTO;
import com.example.user_api.UserApiApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @GetMapping("/users")
    public List<UserDTO> getUser(){
        return UserApiApplication.users;
    };

}
