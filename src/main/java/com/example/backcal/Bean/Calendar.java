package com.example.backcal.Bean;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Calendar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date Heure_deb;
    private Date Heure_fin;

    @OneToMany

    private Set<Exam> exams = new HashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getHeure_deb() {
        return Heure_deb;
    }

    public void setHeure_deb(Date heure_deb) {
        Heure_deb = heure_deb;
    }

    public Date getHeure_fin() {
        return Heure_fin;
    }

    public void setHeure_fin(Date heure_fin) {
        Heure_fin = heure_fin;
    }

    public Set<Exam> getExams() {
        return exams;
    }

    public void setExams(Set<Exam> exams) {
        this.exams = exams;
    }
}
