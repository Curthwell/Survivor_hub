package com.example.robot.entity;

import jakarta.persistence.*;

//A survivor must have a name, age, gender, ID and last location (latitude, longitude).
@Entity
@Table(name="survivor")
public class Survivor {

    //fields or data members
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    @Column(name="name")
    private String name;
    @Column(name="age")
    private int age;
    @Column(name = "gender")
    private String gender;
    @Embedded
    private Location lastLocation;


    @Column(name="infectedStatus")
    private boolean infected;




    private int contaminationReports;
    private Resource resource;
    public Survivor() {
    }
    public Survivor(int contaminationReports) {
        this.contaminationReports = contaminationReports;
    }
    public Survivor(Long id, String name, int age, String gender, Location lastLocation, boolean infected, Resource resource) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.lastLocation = lastLocation;
        this.infected = infected;
        this.resource = resource;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Location getLastLocation() {
        return lastLocation;
    }

    public void setLastLocation(Location lastLocation) {
        this.lastLocation = lastLocation;
    }

    public boolean isInfected() {
        return infected;
    }

    public void setInfected(boolean infected) {
        this.infected = infected;
    }

    public Resource getResource() {
        return resource;
    }

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    public int getContaminationReports() {
        return contaminationReports;
    }

    public void setContaminationReports(int contaminationReports) {
        this.contaminationReports = contaminationReports;
    }
}
