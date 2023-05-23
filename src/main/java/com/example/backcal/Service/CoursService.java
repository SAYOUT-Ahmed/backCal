package com.example.backcal.Service;

import com.example.backcal.Bean.Admin;
import com.example.backcal.Bean.Cours;
import com.example.backcal.repository.CoursRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CoursService {
    @Autowired
    private CoursRepo coursRepo;

    public List<Cours> findAll() {
        return coursRepo.findAll();
    }

    public Cours save(Cours entity) {
        return coursRepo.save(entity);
    }

    public Optional<Cours> findById(Long aLong) {
        return coursRepo.findById(aLong);
    }

    public void deleteById(Long aLong) {
        coursRepo.deleteById(aLong);
    }

}
