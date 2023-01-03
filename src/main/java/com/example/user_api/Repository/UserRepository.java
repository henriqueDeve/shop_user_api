package com.example.user_api.Repository;

import com.example.user_api.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Long> {

    User findByCpf(String cpf);
    List<User> queryByNameLike(String name);

}
