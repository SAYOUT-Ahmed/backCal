package com.example.backcal.Service;

import com.example.backcal.Bean.Etudiant;
import com.example.backcal.repository.EtudiantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EtudiantService {
    @Autowired
    private EtudiantRepo etudiantRepo;

    public void update(Etudiant etudiant) {
        etudiantRepo.save(etudiant);
    }

    public List<Etudiant> findAll() {
        return etudiantRepo.findAll();
    }

    public Etudiant save(Etudiant o) {
    /*    if (AjouterEtudiant(o) == false){
            return null;
        }   else */
            return etudiantRepo.save(o);
    }

    public Optional<Etudiant> findById(Long aLong) {
        return etudiantRepo.findById(aLong);
    }

    public void deleteById(Long aLong) {
        etudiantRepo.deleteById(aLong);
    }



    /* public boolean AjouterEtudiant(Etudiant e) {
        List<Etudiant> list = new ArrayList<>();

        for (Etudiant etudiant : list){
            if (e.getNum_apo() == etudiant.getNum_apo() ){
                return false;
            } else {
                etudiantRepo.save(e);
                return true;
            }
        }
        return false;
    } */
}
