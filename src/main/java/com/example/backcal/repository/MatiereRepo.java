package com.example.backcal.repository;

import com.example.backcal.Bean.Matiere;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatiereRepo extends JpaRepository<Matiere,Long> {

}
