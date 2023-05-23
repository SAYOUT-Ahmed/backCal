package com.example.backcal.Service;

import com.example.backcal.Bean.Salle;
import com.example.backcal.repository.SalleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class SalleService {

    @Autowired
    private SalleRepo salleRepo;

    public void update(Salle salle) {
        salleRepo.save(salle);
    }

    public List<Salle> findAll() {
        return salleRepo.findAll();
    }

    public Salle save(Salle entity) {
        return salleRepo.save(entity);
    }

    public Optional<Salle> findById(Long aLong) {
        return salleRepo.findById(aLong);
    }

    public void deleteById(Long aLong) {
        salleRepo.deleteById(aLong);
    }

}
