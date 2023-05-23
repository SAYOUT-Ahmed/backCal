package com.example.backcal.repository;

import com.example.backcal.Bean.Surveillant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SurveillantRepo extends JpaRepository<Surveillant,Long> {

}
