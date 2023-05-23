package com.example.backcal.WebService;

import com.example.backcal.Bean.Etudiant;
import com.example.backcal.Service.EtudiantService;
import com.example.backcal.repository.EtudiantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController()
@RequestMapping("/api/etudiant")
public class EtudiantController {

    @Autowired
    private EtudiantService etudiantService;


    @PutMapping("/update")
    public void update(@RequestBody Etudiant etudiant) {
        etudiantService.update(etudiant);
    }

    @GetMapping("/")
    public List<Etudiant> findAll() {
        return etudiantService.findAll();
    }

    @PostMapping("/save")
    public Etudiant save(@RequestBody Etudiant entity) {
        return etudiantService.save(entity);
    }

    @GetMapping("/id/{id}")
    public Optional<Etudiant> findById(@PathVariable Long aLong) {
        return etudiantService.findById(aLong);
    }


    @DeleteMapping("/delete/{etudiant}")
    public void deleteById(Long aLong) {
        etudiantService.deleteById(aLong);
    }
}
