package com.example.backcal.Service;

import com.example.backcal.Bean.Departement;
import com.example.backcal.repository.DepartementRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartementService {
    @Autowired
    private DepartementRepo departementRepo;

    public void update(Departement departement) {
        departementRepo.save(departement);
    }

    public List<Departement> findAll() {
        return departementRepo.findAll();
    }

    public Departement save(Departement entity) {
        return departementRepo.save(entity);
    }

    public Optional<Departement> findById(Long aLong) {
        return departementRepo.findById(aLong);
    }

    public void deleteById(Long aLong) {
        departementRepo.deleteById(aLong);
    }
}
