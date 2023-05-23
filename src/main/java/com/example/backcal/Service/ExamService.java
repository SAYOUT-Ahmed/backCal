package com.example.backcal.Service;

import com.example.backcal.Bean.Exam;
import com.example.backcal.Bean.Salle;
import com.example.backcal.repository.ExamRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class ExamService {
    @Autowired
    private ExamRepo examRepo;

    @Autowired
    private SalleService salleService;

    public void update(Exam exam) {
        examRepo.save(exam);
    }

    public List<Exam> findAll() {
        return examRepo.findAll();
    }

    public Exam save(Exam entity) {
        return examRepo.save(entity);
    }

    public Optional<Exam> findById(Long aLong) {
        return examRepo.findById(aLong);
    }

    public void deleteById(Long aLong) {
        examRepo.deleteById(aLong);
    }

}
