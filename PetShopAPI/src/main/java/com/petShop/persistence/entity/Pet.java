package com.petShop.persistence.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "mascotas")
public class Pet {
    //Atributos
    // CREATE TABLE Pet (
    //    petID INT PRIMARY KEY AUTO_INCREMENT,
    //    ownerID INT,
    //    namePet VARCHAR(50),
    //    species VARCHAR(50),
    //    age INT,
    //    gender varchar(50),
    //    FOREIGN KEY (ownerID) REFERENCES Owner(ownerID)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_mascota")
    private Integer id;

    @Column(name = "nombre")
    private String name;

    @Column(name = "especie")
    private String species;

    @Column(name = "edad")
    private int age;

    @Column(name = "genero")
    private String gender;

    // relationships
    @ManyToOne
    @JoinColumn(name = "id_propietario")
    private Owner owner;

    @OneToMany (mappedBy = "pet")
    private List<MedicalHistory> medicalHistory;

    @OneToMany (mappedBy = "pet")
    private List<AppointmentDetail> appointmentDetails;

    //getters and setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
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
}
