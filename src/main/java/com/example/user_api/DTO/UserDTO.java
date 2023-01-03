package com.example.user_api.DTO;

import com.example.user_api.Model.User;

import java.util.Date;

public class UserDTO {

    private String name;
    private String email;
    private String tel;
    private String cpf;
    private String address;
    private Date dateRegister;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDateRegister() {
        return dateRegister;
    }

    public void setDateRegister(Date dateRegister) {
        this.dateRegister = dateRegister;
    }

    public static UserDTO convert(User user) {
        UserDTO userDTO = new UserDTO();

        userDTO.setName(user.getName());
        userDTO.setAddress(user.getAddress());
        userDTO.setCpf(user.getCpf());
        userDTO.setEmail(user.getEmail());
        userDTO.setTel(user.getTel());
        userDTO.setDateRegister(user.getDateRegister());

        return userDTO;
    }
}
