package com.example.robot.entity;

import jakarta.persistence.*;
@Entity
@Table(name = "infected_survivor")
public class InfectedSurvivor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int contaminationReports;



    @ManyToOne
    @JoinColumn(name = "survivor_id")
    private Survivor survivor;

    public void setSurvivor(Survivor survivor) {
    }

    //public InfectedSurvivor() {
   //}

    //public InfectedSurvivor(Long id, Long survivorId, int contaminationReports) {
        //this.id = id;
        //this.survivorId = survivorId;
        //this.contaminationReports = contaminationReports;
    //}



    //public void setContaminationReports(int contaminationReports) {
        //this.contaminationReports = contaminationReports;
    //}
// Constructors, Getters, and Setters
    // ...

    //public void incrementContaminationReports() {
        //this.contaminationReports++;
    //}

    //public boolean isInfected() {
        //return contaminationReports >= 3;
    //}
}
