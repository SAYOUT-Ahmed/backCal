package com.example.backcal.Service;

import com.example.backcal.Bean.Matiere;
import com.example.backcal.repository.MatiereRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MatiereService {

    @Autowired
    private MatiereRepo matiereRepo;

    public void update(Matiere matiere) {
        matiereRepo.save(matiere);
    }

    public List<Matiere> findAll() {
        return matiereRepo.findAll();
    }

    public Matiere save(Matiere entity) {
        return matiereRepo.save(entity);
    }

    public Optional<Matiere> findById(Long aLong) {
        return matiereRepo.findById(aLong);
    }


    public void deleteById(Long aLong) {
        matiereRepo.deleteById(aLong);
    }
}
