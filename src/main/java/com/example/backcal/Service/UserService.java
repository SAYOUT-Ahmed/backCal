package com.example.backcal.Service;

import com.example.backcal.Conf.User;
import com.example.backcal.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;


    public Optional<User> findByUsername(String username) {
        return userRepo.findByUsername(username);
    }

    public Boolean existsByUsername(String username) {
        return userRepo.existsByUsername(username);
    }

    public Boolean existsByEmail(String email) {
        return userRepo.existsByEmail(email);
    }

    public List<User> findAll() {
        return userRepo.findAll();
    }

    public User save(User entity) {
        return userRepo.save(entity);
    }

    public Optional<User> findById(Long aLong) {
        return userRepo.findById(aLong);
    }

    public void delete(User entity) {
        userRepo.delete(entity);
    }


}
