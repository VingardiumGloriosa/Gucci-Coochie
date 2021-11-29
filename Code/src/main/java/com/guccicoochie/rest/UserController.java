package com.guccicoochie.rest;

import com.guccicoochie.dtos.UserDTO;
import com.guccicoochie.services.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/users")
public class UserController {

    UserService userService;

    @GetMapping()
    List<UserDTO> getAllUsers(){
        return userService.getUsers();
    }
}
