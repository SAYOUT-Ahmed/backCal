package com.example.backcal.Service;

import com.example.backcal.Bean.Calendar;
import com.example.backcal.repository.CalendarRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CalendarService {
    @Autowired
    private CalendarRepo calendarRepo;

    public List<Calendar> findAll() {
        return calendarRepo.findAll();
    }

    public Calendar save(Calendar entity) {
        return calendarRepo.save(entity);
    }

    public Optional<Calendar> findById(Long aLong) {
        return calendarRepo.findById(aLong);
    }

    public void deleteById(Long aLong) {
        calendarRepo.deleteById(aLong);
    }
}
