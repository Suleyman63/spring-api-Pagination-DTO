package com.example.demo.controller;


import com.example.demo.dto.UserDTO;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserContoller {

    private final UserService userService;

    public UserContoller(UserService userService){
        this.userService = userService;
    }


    @PostMapping("/create")
    public ResponseEntity<UserDTO> createUser(@RequestBody UserDTO user){
        UserDTO result = userService.createUser(user);
        return ResponseEntity.ok(result);
    }


    @GetMapping("/getAll")
    public ResponseEntity<List<UserDTO>> getAll(){
        List<UserDTO> users = userService.getAll();
        return ResponseEntity.ok(users);
    }


    @GetMapping("/getById/{id}")
    public ResponseEntity<UserDTO> getUser(@PathVariable("id") Long id){
        UserDTO user = userService.getUser(id);
        return ResponseEntity.ok(user);

    }


    @DeleteMapping("remove/{id}")
    public ResponseEntity<Boolean> deleteUser(@PathVariable("id") Long id){
        Boolean status = userService.deleteUser(id);
        return ResponseEntity.ok(status);

    }


    @PutMapping("/edit/{id}")
    public ResponseEntity<UserDTO> editUser(@PathVariable("id") Long id, @RequestBody UserDTO user){
        UserDTO result = userService.editUser(id,user);
        return ResponseEntity.ok(result);

    }
}
