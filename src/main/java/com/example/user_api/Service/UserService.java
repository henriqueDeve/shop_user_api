package com.example.user_api.Service;


import com.example.user_api.DTO.UserDTO;
import com.example.user_api.Exception.NotFoundException;
import com.example.user_api.Repository.UserRepository;
import com.example.user_api.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public List<UserDTO> getUserAll() {
        List<User> users = (List<User>) userRepository.findAll();
        return users
                .stream()
                .map(UserDTO::convert)
                .collect(Collectors.toList());
    }

    public UserDTO getUserById(Long id) {
        Optional<User> user = userRepository.findById(id);
        if (user.isPresent()) {
            UserDTO.convert(user.get());
        }
        return null;
    }

    public User saveUser(UserDTO userDTO) {
        userDTO.setDateRegister(new Date());
        User user = userRepository.save(User.convertDTO(userDTO));
        return user;
    }

    public void deleteUser(Long id) {
        Optional<User> user = userRepository.findById(id);
        if (user.isPresent()) {
            userRepository.delete(user.get());
        } else {
            throw new NotFoundException("Usuario " + id + "não encontrado");
        }
    }

    public UserDTO getUserByCPF(String cpf) {
        User user = userRepository.findByCpf(cpf);
        if (user != null) {
            return UserDTO.convert(user);
        } else {
            throw new NotFoundException("Usuario do cpf:" + cpf + "não foi encontrado");
        }
    }

    public List<UserDTO> getUserByName(String name) {
        List<User> users = userRepository.queryByNameLike(name);

        return users
                .stream()
                .map(UserDTO::convert)
                .collect(Collectors.toList());
    }


}
