package com.PetShop.persistence.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name="veterinarios")
public class Veterinarian {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_veterinario")
    private Integer veterianarianID;

    @Column(name="nombre_veterinario")
    private String veterinarianFirstName;

    @Column(name="apellido_veterinario")
    private String veterinarianLastName;

    @Column(name="titulo")
    private String degree;

    @Column(name="telefono_veterinario")
    private String veterinarianPhone;

    @Column(name="email_veterinario")
    private String veterinarianEmail;

    @Column(name="edad_veterinario")
    private Integer age;

    //Relationships
    @OneToMany(mappedBy="veterinarian")
    private List<MedicalAppointment> medicalAppointments;

    @OneToMany(mappedBy="veterinarian")
    private List<MedicalHistory> medicalHistory;

    //Getters and Setters

    public Integer getVeterianarianID() {
        return veterianarianID;
    }

    public void setVeterianarianID(Integer veterianarianID) {
        this.veterianarianID = veterianarianID;
    }

    public String getVeterinarianFirstName() {
        return veterinarianFirstName;
    }

    public void setVeterinarianFirstName(String veterinarianFirstName) {
        this.veterinarianFirstName = veterinarianFirstName;
    }

    public String getVeterinarianLastName() {
        return veterinarianLastName;
    }

    public void setVeterinarianLastName(String veterinarianLastName) {
        this.veterinarianLastName = veterinarianLastName;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getVeterinarianPhone() {
        return veterinarianPhone;
    }

    public void setVeterinarianPhone(String veterinarianPhone) {
        this.veterinarianPhone = veterinarianPhone;
    }

    public String getVeterinarianEmail() {
        return veterinarianEmail;
    }

    public void setVeterinarianEmail(String veterinarianEmail) {
        this.veterinarianEmail = veterinarianEmail;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<MedicalAppointment> getMedicalAppointments() {
        return medicalAppointments;
    }

    public void setMedicalAppointments(List<MedicalAppointment> medicalAppointments) {
        this.medicalAppointments = medicalAppointments;
    }

    public List<MedicalHistory> getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(List<MedicalHistory> medicalHistory) {
        this.medicalHistory = medicalHistory;
    }
}

