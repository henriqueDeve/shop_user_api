package com.example.user_api.Controller;

import com.example.user_api.DTO.UserDTO;
import com.example.user_api.Model.User;
import com.example.user_api.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class UserController {
   @Autowired
   private UserService userService;

    @GetMapping("/users")
    public List<UserDTO> getUser() {
        List<UserDTO> userDTOS = userService.getUserAll();
        return userDTOS;
    }

    @GetMapping("/users/{cpf}")
    public UserDTO getUserById(@PathVariable String cpf) {
        return userService.getUserByCPF(cpf);
    }

    @PostMapping("/user")
    public User saveUser(@RequestBody UserDTO user) {
        return userService.saveUser(user);
    }

    @DeleteMapping("/user/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }

    @GetMapping("/user/search")
    public List<UserDTO> getUserByName(@RequestParam(name = "name", required = true) String name) {
        return userService.getUserByName(name);
    }
}
