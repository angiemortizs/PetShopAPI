package com.PetShop.persistence.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "empleados")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_empleado")
    private Integer employeeID;

    @Column(name = "nombre_empleado")
    private String employeeFirstName;

    @Column(name = "apellido_empleado")
    private String employeeLastName;

    @Column(name = "telefono_empleado")
    private String employeePhoneNumber;

    @Column(name = "email_empleado")
    private String employeeEmail;

    //Relationships
    @OneToMany(mappedBy = "employee")
    private List<Invoice> invoices;

    public Integer getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(Integer employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmployeeFirstName() {
        return employeeFirstName;
    }

    public void setEmployeeFirstName(String employeeFirstName) {
        this.employeeFirstName = employeeFirstName;
    }

    public String getEmployeeLastName() {
        return employeeLastName;
    }

    public void setEmployeeLastName(String employeeLastName) {
        this.employeeLastName = employeeLastName;
    }

    public String getEmployeePhoneNumber() {
        return employeePhoneNumber;
    }

    public void setEmployeePhoneNumber(String employeePhoneNumber) {
        this.employeePhoneNumber = employeePhoneNumber;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    public List<Invoice> getInvoices() {
        return invoices;
    }

    public void setInvoices(List<Invoice> invoices) {
        this.invoices = invoices;
    }
}


//employeeID INT PRIMARY KEY AUTO_INCREMENT,
//employeeFirstName VARCHAR(50),
//employeeLastName VARCHAR(50),
//employeePhoneNumber VARCHAR(20),
//employeeEmail VARCHAR(100)