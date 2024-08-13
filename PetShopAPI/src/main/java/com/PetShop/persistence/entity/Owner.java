package com.PetShop.persistence.entity;

import jakarta.persistence.*;

import java.util.List;

public class Owner {
    /*
    Atributos
    id
    nombre del propietario
    apellidos del propietario
    correo electronico
    telefono / celular
    direccion
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_owner")
    private Integer ID;

    @Column(name = "nombre_propietario")
    private String nameOwner;

    @Column(name = "apellido_propietario")
    private String ownerLastName;

    @Column(name = "correo_electronico")
    private String ownerEmail;

    @Column(name = "telefono_celular")
    private Integer ownerPhoneNumber;

    @Column(name= "direccion")
    private String ownerAddress;

    //relationships

    @OneToMany(mappedBy = "owner")
    private List<Pet> pets;

    @OneToMany(mappedBy = "owner")
    private List<MedicalAppointment> medicalAppointments;



    //getters and setters
    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getNameOwner() {
        return nameOwner;
    }

    public void setNameOwner(String nameOwner) {
        this.nameOwner = nameOwner;
    }

    public String getOwnerLastName() {
        return ownerLastName;
    }

    public void setOwnerLastName(String ownerLastName) {
        this.ownerLastName = ownerLastName;
    }

    public String getOwnerEmail() {
        return ownerEmail;
    }

    public void setOwnerEmail(String ownerEmail) {
        this.ownerEmail = ownerEmail;
    }

    public Integer getOwnerPhoneNumber() {
        return ownerPhoneNumber;
    }

    public void setOwnerPhoneNumber(Integer ownerPhoneNumber) {
        this.ownerPhoneNumber = ownerPhoneNumber;
    }

    public String getOwnerAddress() {
        return ownerAddress;
    }

    public void setOwnerAddress(String ownerAddress) {
        this.ownerAddress = ownerAddress;
    }
}
