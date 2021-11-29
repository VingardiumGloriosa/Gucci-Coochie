package com.guccicoochie.services;

import com.guccicoochie.dtos.UserDTO;
import com.guccicoochie.entities.User;
import com.guccicoochie.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public UserService(){}

    public List<UserDTO> getUsers(){
        return UserDTO.UserDTOSfromUser(userRepository.findAll());
    }

}
