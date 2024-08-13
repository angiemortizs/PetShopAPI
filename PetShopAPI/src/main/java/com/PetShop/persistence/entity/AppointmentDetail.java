package com.PetShop.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "DetallesCitas")
public class AppointmentDetail {

    @ManyToOne
    @JoinColumn(name = "id_cita")
    private MedicalAppointment medicalAppointment;

    @ManyToOne
    @JoinColumn(name = "id_mascota")
    private com.petShop.persistence.entity.Pet pets;

    // Getters and Setters

    public MedicalAppointment getMedicalAppointment() {
        return medicalAppointment;
    }

    public void setMedicalAppointment(MedicalAppointment medicalAppointment) {
        this.medicalAppointment = medicalAppointment;
    }

    public com.petShop.persistence.entity.Pet getPets() {
        return pets;
    }

    public void setPets(com.petShop.persistence.entity.Pet pets) {
        this.pets = pets;
    }
}

//CREATE TABLE AppointmentDetail (
  // appointmentID INT PRIMARY KEY,
  // petID INT,
//FOREIGN KEY (appointmentID) REFERENCES MedicalAppointment(appointmentID),
//FOREIGN KEY (petID) REFERENCES Pet(petID)