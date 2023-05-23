package com.example.backcal.repository;

import com.example.backcal.Bean.Salle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalleRepo extends JpaRepository<Salle,Long> {

}
