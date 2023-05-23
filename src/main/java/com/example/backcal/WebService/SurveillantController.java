package com.example.backcal.WebService;

import com.example.backcal.Bean.Surveillant;
import com.example.backcal.Service.SurveillantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/surveillant")
public class SurveillantController {
    @Autowired
    private SurveillantService surveillantService;

    @PutMapping("/update")
    public void update(@RequestBody Surveillant surveillant) {
        surveillantService.update(surveillant);
    }

    @GetMapping("/")
    public List<Surveillant> findAll() {
        return surveillantService.findAll();
    }

    @PostMapping("/save")
    public Surveillant save(Surveillant entity) {
        return surveillantService.save(entity);
    }

    @GetMapping("/surveillant/{id}")
    public Optional<Surveillant> findById(Long aLong) {
        return surveillantService.findById(aLong);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(Long aLong) {
        surveillantService.deleteById(aLong);
    }
}
