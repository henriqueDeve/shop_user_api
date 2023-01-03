package com.example.user_api.Service;

import Repository.UserRepository;
import com.example.user_api.DTO.UserDTO;
import com.example.user_api.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> getUserAll() {
        List<User> user = userRepository.findAll();

        return user
                .stream()
                .map(UserDTO::convert)
                .collect(Collectors.toList());
    }

}
