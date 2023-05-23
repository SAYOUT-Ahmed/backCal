package com.example.backcal.repository;

import com.example.backcal.Bean.Departement;
import com.example.backcal.Bean.Niveau;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartementRepo extends JpaRepository<Departement,Long> {

}
