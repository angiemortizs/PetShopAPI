package com.petShop.persistence.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "CitasMedicas")
public class MedicalAppointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cita")
    private Integer appointmentID;

    @Column(name = "fecha_cita")
    private String appointmentDate;

    @Column(name = "hora_cita")
    private String appointmentTime;

    @Column(name = "costo_cita")
    private double appointmentCost;

    // Relationships
    @ManyToOne
    @JoinColumn(name = "id_veterinario")
    private Veterinarian veterinarian;

    @OneToMany(mappedBy = "appointment")
    private List<Invoice> invoices;

    @OneToMany(mappedBy = "appointment")
    private List<MedicalHistory> medicalHistory;

    @OneToMany(mappedBy = "appointment")
    private List<AppointmentDetail> appointmentDetails;

    // Getters and setters

    public Integer getAppointmentID() {
        return appointmentID;
    }

    public void setAppointmentID(Integer appointmentID) {
        this.appointmentID = appointmentID;
    }

    public String getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(String appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public String getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(String appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

    public double getAppointmentCost() {
        return appointmentCost;
    }

    public void setAppointmentCost(double appointmentCost) {
        this.appointmentCost = appointmentCost;
    }

    public Veterinarian getVeterinarian() {
        return veterinarian;
    }

    public void setVeterinarian(Veterinarian veterinarian) {
        this.veterinarian = veterinarian;
    }

    public List<Invoice> getInvoices() {
        return invoices;
    }

    public void setInvoices(List<Invoice> invoices) {
        this.invoices = invoices;
    }

    public List<MedicalHistory> getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(List<MedicalHistory> medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    public List<AppointmentDetail> getAppointmentDetail() {
        return appointmentDetails;
    }

    public void setAppointmentDetail(List<AppointmentDetail> appointmentDetail) {
        this.appointmentDetails = appointmentDetail;
    }
}
