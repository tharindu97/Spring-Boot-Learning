package com.example.fitsrproject.services;
import com.example.fitsrproject.domain.UserModel;
import java.util.List;

public interface UserServices {
    List<UserModel> findAllUsers();
    String saveUser(UserModel userModel);
    String updateUser(UserModel userModel);
    UserModel findById(Integer id);
}
