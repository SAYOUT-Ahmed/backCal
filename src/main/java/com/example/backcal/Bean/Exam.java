package com.example.backcal.Bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Exam {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date date;
    @ManyToOne
    private Matiere matiere;


    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    @JoinTable(name = "exam_etudiants",
    joinColumns = { @JoinColumn(name="exam_id") },
    inverseJoinColumns = { @JoinColumn(name = "etudiant_id")} )
    private Set<Etudiant> students = new HashSet<>();


    @OneToMany
    private Set<Salle> salles = new HashSet<>();


    @ManyToOne
    private Professeur professeur;



    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "id_calendar",nullable = false)
    @JsonIgnore
    private Calendar calendar;




    public Calendar getCalendar() {
        return calendar;
    }

    public void setCalendar(Calendar calendar) {
        this.calendar = calendar;
    }

    public Set<Etudiant> getEtudiants() {
        return students;
    }

    public void setEtudiants(Set<Etudiant> etudiants) {
        this.students = etudiants;
    }

    public Set<Salle> getSalles() {
        return salles;
    }

    public void setSalles(Set<Salle> salles) {
        this.salles = salles;
    }

    public Professeur getProfesseur() {
        return professeur;
    }

    public void setProfesseur(Professeur professeur) {
        this.professeur = professeur;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Matiere getMatiere() {
        return matiere;
    }

    public void setMatiere(Matiere matiere) {
        this.matiere = matiere;
    }
}
