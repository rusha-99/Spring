package com.example.demo.controller;

import com.example.demo.dto.UserDTO;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
// RESTful controller - (UserController) this class is responsible for handling HTTP req and returning HTTP Responses
//The return values from your controller methods are automatically converted into JSON and included in the HTTP response body.
@RequestMapping(value = "api/v1/user")
//map HTTP requests to specific controller methods. (GET, POST, PUT, DELETE, etc.)
@CrossOrigin
//To deal wit two ports
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping ("/getUsers")
    public List<UserDTO> getUser(){
        return userService.getAllUsers();
    }

    @GetMapping ("/getUser")
    public List<UserDTO> getUserId(){
        return userService.getUserId(1);
    }

    @PostMapping("/saveUser")
    public UserDTO saveUser(@RequestBody UserDTO userDTO){

        return userService.saveUser(userDTO);
    }

    @PutMapping("/updateUser")
    public UserDTO updateUser(@RequestBody UserDTO userDTO){
        return userService.updateUser(userDTO);

    }

    @DeleteMapping ("/deleteUser")
    public boolean deleteUser(@RequestBody UserDTO userDTO){

        return userService.delete(userDTO);
    }


}
