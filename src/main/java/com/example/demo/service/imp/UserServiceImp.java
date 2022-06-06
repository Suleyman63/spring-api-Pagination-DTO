package com.example.demo.service.imp;

import com.example.demo.dto.UserDTO;
import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserServiceImp implements UserService {

    private final UserRepository userRepository;
    private final ModelMapper modelMapper;


    @Override
    public UserDTO createUser(UserDTO userDTO) {
        User user = modelMapper.map(userDTO, User.class);
        user.setCreateDate(new Date());
        user.setCreatedBy("Admin");
        return modelMapper.map(userRepository.save(user), UserDTO.class);
    }

    @Override
    public List<UserDTO> getAll() {
        List<User> users = userRepository.findAll();
        List<UserDTO> dtos = users.stream().
                map(user -> modelMapper.map(user, UserDTO.class)).
                collect(Collectors.toList());
        return dtos;
    }

    @Override
    public UserDTO getUser(Long id) {
       Optional<User> user = userRepository.findById(id);

       if (user.isPresent()){
           return modelMapper.map(user.get(), UserDTO.class);
       }
        return null;
    }


    @Override
    public Boolean deleteUser(Long id) {
        Optional<User> user = userRepository.findById(id);

        if (user.isPresent()){
             userRepository.findById(id);
             return true;
        }
        return null;
    }


    @Override
    public UserDTO editUser(Long id, UserDTO user) {
        Optional<User> result = userRepository.findById(id);

        if (result.isPresent()){
             result.get().setFirstname(user.getFirstname());
             result.get().setLastname(user.getLastname());
             result.get().setAge(user.getAge());
             result.get().setUpdateDate(new Date());
             result.get().setUpdateBy("Admin");
             return modelMapper.map(userRepository.save(result.get()), UserDTO.class);
        }

        return null;
    }


}
