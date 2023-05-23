package com.example.backcal.WebService;

import com.example.backcal.Bean.Admin;
import com.example.backcal.Service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("admin/api")
public class AdminController {
    @Autowired
    private AdminService adminService;

    @GetMapping("/")
    public List<Admin> findAll() {
        return adminService.findAll();
    }

    @PostMapping("/save")
    public Admin save(@RequestBody Admin entity) {
        return adminService.save(entity);
    }

    @GetMapping("/admin/{id}")
    public Optional<Admin> findById(@PathVariable Long aLong) {
        return adminService.findById(aLong);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable Long aLong) {
        adminService.deleteById(aLong);
    }




    @PutMapping("/update")
    public void update(Admin admin) {
        adminService.update(admin);
    }
}
