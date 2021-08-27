package com.example.fitsrproject.repositories;
import com.example.fitsrproject.domain.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositories extends JpaRepository<UserModel, Integer> {

}
