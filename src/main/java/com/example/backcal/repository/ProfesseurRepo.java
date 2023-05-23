package com.example.backcal.repository;

import com.example.backcal.Bean.Professeur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfesseurRepo extends JpaRepository<Professeur,Long> {

}
