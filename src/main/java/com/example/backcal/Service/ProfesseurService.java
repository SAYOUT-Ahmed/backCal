package com.example.backcal.Service;

import com.example.backcal.Bean.Professeur;
import com.example.backcal.repository.ProfesseurRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProfesseurService {
    @Autowired
    private ProfesseurRepo professeurRepo;

    public void update(Professeur professeur) {
        professeurRepo.save(professeur);
    }

    public List<Professeur> findAll() {
        return professeurRepo.findAll();
    }

    public Professeur save(Professeur entity) {
        return professeurRepo.save(entity);
    }

    public Optional<Professeur> findById(Long aLong) {
        return professeurRepo.findById(aLong);
    }

    public void deleteById(Long aLong) {
        professeurRepo.deleteById(aLong);
    }
}
