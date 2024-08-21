package com.petShop.persistence.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="Proveedores")
public class Supplier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_proveedor")
    private Integer supplierId;

    @Column(name="nombre_proveedor")
    private String supplierName;

    @Column(name="direccion_proveedor")
    private String supplierAddress;

    @Column(name="telefono_proveedor")
    private String supplierPhone;

    @Column(name="email_proveedor")
    private String supplierEmail;

    //Relationships
    @OneToMany(mappedBy = "supplier")
    private List<Product> products;

    //Getters and setters

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getSupplierAddress() {
        return supplierAddress;
    }

    public void setSupplierAddress(String supplierAddress) {
        this.supplierAddress = supplierAddress;
    }

    public String getSupplierPhone() {
        return supplierPhone;
    }

    public void setSupplierPhone(String supplierPhone) {
        this.supplierPhone = supplierPhone;
    }

    public String getSupplierEmail() {
        return supplierEmail;
    }

    public void setSupplierEmail(String supplierEmail) {
        this.supplierEmail = supplierEmail;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}


//supplierID INT PRIMARY KEY AUTO_INCREMENT,
//supplierName VARCHAR(50),
//supplierAddress VARCHAR(200),
//supplierEmail VARCHAR(100),
//supplierPhone VARCHAR(20)