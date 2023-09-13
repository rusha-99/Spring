package com.example.demo.controller;

import com.example.demo.dto.UserDTO;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping ("/getUser")
    public String getUser(){
        return "Tharusha Pathirana";
    }

    @PostMapping("/saveUser")
    public UserDTO saveUser(@RequestBody UserDTO userDTO){

        return userService.saveUser(userDTO);
    }

    @PutMapping("/updateUser")
    public String updateUser(){
        return " Update User";
    }

    @DeleteMapping ("/deleteUser")
    public String deleteUser(){
        return " delete User";
    }


}
