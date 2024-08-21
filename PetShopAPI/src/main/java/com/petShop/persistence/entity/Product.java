package com.petShop.persistence.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "productos")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Integer productID;

    @Column(name = "nombre_producto")
    private String productName;

    @Column(name = "categoria_producto")
    private String productCategory;

    @Column(name = "marca_producto")
    private String brand;

    @Column(name = "precio_producto")
    private Double price;

    // relationships
    @ManyToOne
    @JoinColumn(name = "id_proveedor")
    private Supplier supplier;

    @OneToMany(mappedBy = "product")
    private List<Invoice> invoices;

    // getters and setters

    public Integer getProductID() {
        return productID;
    }

    public void setProductID(Integer productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public List<Invoice> getInvoices() {
        return invoices;
    }

    public void setInvoices(List<Invoice> invoices) {
        this.invoices = invoices;
    }
}

//productID INT PRIMARY KEY AUTO_INCREMENT,
//supplierID INT,
//productName VARCHAR(50),
//category VARCHAR(50),
//brand VARCHAR(50),
//price DOUBLE,
//FOREIGN KEY (supplierID) REFERENCES Supplier(supplierID)