package com.example.backcal.repository;

import com.example.backcal.Bean.EnumRole;
import com.example.backcal.Conf.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepo extends JpaRepository<Role,Long> {
    Optional<Role> findByName(EnumRole name);
}
