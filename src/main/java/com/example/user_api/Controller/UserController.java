package com.example.user_api.Controller;

import com.example.user_api.DTO.UserDTO;
import netscape.javascript.JSObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @GetMapping("/")
    public List<JSObject> getUser(){

    };

}
