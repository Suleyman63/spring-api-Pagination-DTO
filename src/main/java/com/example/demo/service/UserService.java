package com.example.demo.service;

import com.example.demo.dto.UserDTO;
import com.example.demo.entity.User;

import java.util.List;

public interface UserService {


    UserDTO createUser(UserDTO user);

    List<UserDTO> getAll();

    UserDTO getUser(Long id);

    UserDTO editUser(Long id,UserDTO user);

    Boolean deleteUser(Long id);

}
