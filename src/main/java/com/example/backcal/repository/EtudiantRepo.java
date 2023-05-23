package com.example.backcal.repository;

import com.example.backcal.Bean.Etudiant;
import com.example.backcal.Bean.Niveau;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EtudiantRepo extends JpaRepository<Etudiant,Long> {

}
