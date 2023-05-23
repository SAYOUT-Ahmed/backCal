package com.example.backcal.WebService;

import com.example.backcal.Bean.Departement;
import com.example.backcal.Service.DepartementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/departement")
public class DepartementController {
    @Autowired
    private DepartementService departementService;


    @GetMapping("/all")
    public List<Departement> findAll() {
        return departementService.findAll();
    }

    @PostMapping("/save")
    public Departement save(@RequestBody Departement entity) {
        return departementService.save(entity);
    }

    @GetMapping("/departement/{departement}")
    public Optional<Departement> findById(@PathVariable Long aLong) {
        return departementService.findById(aLong);
    }

    @DeleteMapping("/delete/{departement}")
    public void deleteById(@PathVariable Long aLong) {
        departementService.deleteById(aLong);
    }
}
