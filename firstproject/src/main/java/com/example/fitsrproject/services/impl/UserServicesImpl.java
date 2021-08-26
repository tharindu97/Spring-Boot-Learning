package com.example.fitsrproject.services.impl;
import com.example.fitsrproject.domain.UserModel;
import com.example.fitsrproject.repositories.UserRepositories;
import com.example.fitsrproject.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServicesImpl implements UserServices {

    @Autowired
    private UserRepositories userRepositories;

    @Override
    public List<UserModel> findAllUsers() {
        List<UserModel> allUsers  = userRepositories.findAll();
        return allUsers;
    }

    @Override
    public String saveUser(UserModel userModel) {
        userRepositories.save(userModel);
        return "Data Saved";
    }

    @Override
    public String updateUser(UserModel userModel) {
        String msg = null;
        if(userModel.getId() != null){
            userRepositories.save(userModel);
            msg = "Data Update";
        }else{
            msg = "Error";
        }
        return msg;
    }

    @Override
    public UserModel findById(Integer id) {
//       return userRepositories.findOne(id);
        return null;
    }
}
