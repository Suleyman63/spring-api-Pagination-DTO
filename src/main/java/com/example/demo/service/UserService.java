package com.example.demo.service;

import com.example.demo.dto.UserDTO;
import com.example.demo.entity.User;
import com.example.demo.util.CustomPage;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Slice;
import org.springframework.data.domain.Pageable;


import java.util.List;

public interface UserService {


    UserDTO createUser(UserDTO user);

    List<UserDTO> getAll();

    UserDTO getUser(Long id);

    UserDTO editUser(Long id,UserDTO user);

    Boolean deleteUser(Long id);

    Page<User> pagination(int currentPage, int pageSize);

    Page<User> pagination(Pageable pageable);

    Slice<User> slice(Pageable pageable);

    CustomPage<UserDTO> customPagination(Pageable pageable);

}
