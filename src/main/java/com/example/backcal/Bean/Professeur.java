package com.example.backcal.Bean;

import com.example.backcal.Conf.User;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Professeur extends User {

    private String nom;
    private String prenom;
    @ManyToOne
    private Departement departement;
    @ManyToOne
    private Matiere matiere;

    @ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.PERSIST)
    private Set<Etudiant> etudiants = new HashSet<>();
    @OneToMany
    Set<Exam> exams = new HashSet<>();

    public Set<Etudiant> getEtudiants() {
        return etudiants;
    }

    public void setEtudiants(Set<Etudiant> etudiants) {
        this.etudiants = etudiants;
    }

    public Set<Exam> getExams() {
        return exams;
    }

    public void setExams(Set<Exam> exams) {
        this.exams = exams;
    }

    private String couv_medi;

    public Matiere getMatiere() {
        return matiere;
    }

    public void setMatiere(Matiere matiere) {
        this.matiere = matiere;
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

    public Departement getDepartement() {
        return departement;
    }

    public void setDepartement(Departement departement) {
        this.departement = departement;
    }

    public String getCouv_medi() {
        return couv_medi;
    }

    public void setCouv_medi(String couv_medi) {
        this.couv_medi = couv_medi;
    }
}
