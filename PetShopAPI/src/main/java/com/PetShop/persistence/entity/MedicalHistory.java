package com.PetShop.persistence.entity;

import com.petShop.persistence.entity.Pet;
import jakarta.persistence.*;

@Entity
@Table(name = "historia_medica")
public class MedicalHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_historia_medica")
    private Integer historyID;

    @Column(name = "alergias")
    private String allergies;

    @Column(name = "tratamiento_previos")
    private String previousTreatment;

    @Column(name = "medicamentos_previos")
    private String previousMedications;

    //Relationships
    @ManyToOne
    @JoinColumn(name = "id_pet")
    private Pet pet;

    @ManyToOne
    @JoinColumn(name = "id_cita")
    private MedicalAppointment medicalAppointment;

    //Getters and Setters

    public Integer getHistoryID() {
        return historyID;
    }

    public void setHistoryID(Integer historyID) {
        this.historyID = historyID;
    }

    public String getAllergies() {
        return allergies;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }

    public String getPreviousTreatment() {
        return previousTreatment;
    }

    public void setPreviousTreatment(String previousTreatment) {
        this.previousTreatment = previousTreatment;
    }

    public String getPreviousMedications() {
        return previousMedications;
    }

    public void setPreviousMedications(String previousMedications) {
        this.previousMedications = previousMedications;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(com.petShop.persistence.entity.Pet pet) {
        this.pet = pet;
    }

    public MedicalAppointment getMedicalAppointment() {
        return medicalAppointment;
    }

    public void setMedicalAppointment(MedicalAppointment medicalAppointment) {
        this.medicalAppointment = medicalAppointment;
    }
}

//historyID INT PRIMARY KEY AUTO_INCREMENT,
//petID INT,
//appointmentID INT,
//allergies TEXT,
//previousTreatment TEXT,
//previousMedications TEXT,
//FOREIGN KEY (petID) REFERENCES Pet(petID),
//FOREIGN KEY (appointmentID) REFERENCES MedicalAppointment(appointmentID)