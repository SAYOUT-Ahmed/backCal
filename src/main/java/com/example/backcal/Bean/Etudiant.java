package com.example.backcal.Bean;

import com.example.backcal.Conf.User;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Etudiant extends User {



    private String nom;
    private String prenom;

    private Long num_apo;

    @ManyToMany(mappedBy = "students")
    private Set<Exam> exams = new HashSet<>();

    @ManyToMany(mappedBy = "etudiants")
    private Set<Professeur> professeurs = new HashSet<>();

    public Set<Exam> getExams() {
        return exams;
    }

    public void setExams(Set<Exam> exams) {
        this.exams = exams;
    }

    public Set<Professeur> getProfesseurs() {
        return professeurs;
    }

    public void setProfesseurs(Set<Professeur> professeurs) {
        this.professeurs = professeurs;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Long getNum_apo() {
        return num_apo;
    }

    public void setNum_apo(Long num_apo) {
        this.num_apo = num_apo;
    }
}
