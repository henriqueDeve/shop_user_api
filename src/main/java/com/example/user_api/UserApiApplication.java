package com.example.user_api;

import com.example.user_api.DTO.UserDTO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class UserApiApplication {
	public static void main(String[] args) {SpringApplication.run(UserApiApplication.class, args);}
	public static List<UserDTO> usuarios = new ArrayList<UserDTO>();
	@PostConstruct
	public void initiateList() {
		UserDTO userDTO = new UserDTO();
		userDTO.setName("Eduardo");
		userDTO.setCpf("123");
		userDTO.setAddress("Rua a");
		userDTO.setEmail("eduardo@email.com");
		userDTO.setTel("1234-3454");
		userDTO.setDateRegister(new Date());

		UserDTO userDTO2 = new UserDTO();
		userDTO2.setName("Luiz");
		userDTO2.setCpf("456");
		userDTO2.setAddress("Rua b");
		userDTO2.setEmail("luiz@email.com");
		userDTO2.setTel("1234-3454");
		userDTO2.setDateRegister(new Date());

		UserDTO userDTO3 = new UserDTO();
		userDTO3.setName("Bruna");
		userDTO3.setCpf("678");
		userDTO3.setAddress("Rua c");
		userDTO3.setEmail("bruna@email.com");
		userDTO3.setTel("1234-3454");
		userDTO3.setDateRegister(new Date());
		usuarios.add(userDTO);
		usuarios.add(userDTO2);
		usuarios.add(userDTO3);
	}

}
