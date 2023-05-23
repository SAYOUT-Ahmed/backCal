package com.example.backcal.WebService;

import com.example.backcal.Bean.Professeur;
import com.example.backcal.Service.ProfesseurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/professeur/")
public class ProfesseurController {

    @Autowired
    private ProfesseurService professeurService;

    @PutMapping
    public void update(@RequestBody Professeur professeur) {
        professeurService.update(professeur);
    }

    @GetMapping("/all")
    public List<Professeur> findAll() {
        return professeurService.findAll();
    }

    @PostMapping("/save")
    public Professeur save(@RequestBody Professeur entity) {
        return professeurService.save(entity);
    }

    @GetMapping("/professeur/{professeur}")
    public Optional<Professeur> findById(Long aLong) {
        return professeurService.findById(aLong);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(Long aLong) {
        professeurService.deleteById(aLong);
    }
}
