package com.example.backcal.Service;

import com.example.backcal.Bean.Niveau;
import com.example.backcal.repository.NiveauRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NiveauService {
    @Autowired
    private NiveauRepo niveauRepo;

    public List<Niveau> findAll() {
        return niveauRepo.findAll();
    }

    public Niveau save(Niveau entity) {
        return niveauRepo.save(entity);
    }

    public Optional<Niveau> findById(Long aLong) {
        return niveauRepo.findById(aLong);
    }

    public void deleteById(Long aLong) {
        niveauRepo.deleteById(aLong);
    }
}
