package com.example.backcal.Service;

import com.example.backcal.Bean.Surveillant;
import com.example.backcal.repository.SurveillantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SurveillantService {

    @Autowired
    private SurveillantRepo surveillantRepo;


    public void update(Surveillant surveillant) {
        surveillantRepo.save(surveillant);
    }

    public List<Surveillant> findAll() {
        return surveillantRepo.findAll();
    }

    public Surveillant save(Surveillant entity) {
        return surveillantRepo.save(entity);
    }

    public Optional<Surveillant> findById(Long aLong) {
        return surveillantRepo.findById(aLong);
    }

    public void deleteById(Long aLong) {
        surveillantRepo.deleteById(aLong);
    }
}
