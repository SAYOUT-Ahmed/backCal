package com.example.backcal.WebService;

import com.example.backcal.Bean.Niveau;
import com.example.backcal.Service.NiveauService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/niveau")
public class NiveauController {

    @Autowired
    private NiveauService niveauService;

    @GetMapping("/all")
    public List<Niveau> findAll() {
        return niveauService.findAll();
    }

    @PostMapping("/save")
    public Niveau save(Niveau entity) {
        return niveauService.save(entity);
    }

    @GetMapping("/")
    public Optional<Niveau> findById(Long aLong) {
        return niveauService.findById(aLong);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(Long aLong) {
        niveauService.deleteById(aLong);
    }
}
