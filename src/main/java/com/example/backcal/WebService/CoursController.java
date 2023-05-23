package com.example.backcal.WebService;

import com.example.backcal.Bean.Cours;
import com.example.backcal.Service.CoursService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/cours")
public class CoursController {
    @Autowired
    private CoursService coursService;

    @GetMapping("/all")
    public List<Cours> findAll() {
        return coursService.findAll();
    }

    @PostMapping("/save")
    public Cours save(@RequestBody Cours entity) {
        return coursService.save(entity);
    }

    @GetMapping("/cours/{cours}")
    public Optional<Cours> findById(@PathVariable Long id) {
        return coursService.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable Long aLong) {
        coursService.deleteById(aLong);
    }
}
