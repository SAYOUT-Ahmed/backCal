package com.example.backcal.WebService;

import com.example.backcal.Bean.Matiere;
import com.example.backcal.Service.MatiereService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/matiere")
public class MatiereController {

    @Autowired
    private MatiereService matiereService;


    @PutMapping("/update")
    public void update(@RequestBody Matiere matiere) {
        matiereService.update(matiere);
    }

    @GetMapping("/all")
    public List<Matiere> findAll() {
        return matiereService.findAll();
    }

    @PostMapping("/")
    public Matiere save(Matiere entity) {
        return matiereService.save(entity);
    }

    @GetMapping("/matiere/{id}")
    public Optional<Matiere> findById(Long aLong) {
        return matiereService.findById(aLong);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(Long aLong) {
        matiereService.deleteById(aLong);
    }
}
