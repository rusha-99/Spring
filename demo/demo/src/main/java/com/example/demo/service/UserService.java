package com.example.demo.service;

import com.example.demo.dto.UserDTO;
import com.example.demo.entity.User;
import com.example.demo.repo.UserRepo;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class UserService {
    @Autowired //inject UserRepo to save data to db
    private UserRepo userRepo;
    @Autowired
    private ModelMapper modelMapper;
    public UserDTO saveUser(UserDTO userDTO){
        userRepo.save(modelMapper.map(userDTO, User.class));
        return userDTO;
    }

    public  List<UserDTO> getAllUsers(){

        List<User>userList = userRepo.findAll();
        return modelMapper.map(userList,new TypeToken<List<UserDTO>>(){}.getType());

    }

    public List<UserDTO> getUserId(int id) {
        List<User> userList = userRepo.findById(id); // Assuming you have a findByRole method in your repository
        return modelMapper.map(userList, new TypeToken<List<UserDTO>>() {}.getType());
    }

     public UserDTO updateUser(UserDTO userDTO){
        userRepo.save(modelMapper.map(userDTO,User.class));
        return userDTO;
     }

     public boolean delete(UserDTO userDTO){
        userRepo.delete(modelMapper.map(userDTO,User.class));
        return true;
     }

}
