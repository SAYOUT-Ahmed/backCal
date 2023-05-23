package com.example.backcal.Service;

import com.example.backcal.Bean.Admin;
import com.example.backcal.repository.AdminRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdminService {
    @Autowired
    private AdminRepo adminRepo;


    public List<Admin> findAll() {
        return adminRepo.findAll();
    }

    public Admin save(Admin entity) {
        return adminRepo.save(entity);
    }

    public Optional<Admin> findById(Long aLong) {
        return adminRepo.findById(aLong);
    }

    public void deleteById(Long aLong) {
        adminRepo.deleteById(aLong);
    }

    public void update(Admin admin){ adminRepo.save(admin); }
}
