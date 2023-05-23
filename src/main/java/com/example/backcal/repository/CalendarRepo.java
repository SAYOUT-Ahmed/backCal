package com.example.backcal.repository;

import com.example.backcal.Bean.Calendar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CalendarRepo extends JpaRepository<Calendar,Long> {
}
