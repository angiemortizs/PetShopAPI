package com.petShop.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Detalles del recibo")
public class InvoiceDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_detalle_factura")
    private Integer invoiceDetailID;

    @Column(name = "cantidad")
    private int quantity;

    @Column(name = "precio-unitario")
    private double unitPrice;

    // Relationships

    @ManyToOne
    @JoinColumn(name = "id_factura")
    private Invoice invoice;

    @ManyToOne
    @JoinColumn(name = "id_producto")
    private Product product;

    // Getters and Setters

    public Integer getInvoiceDetailID() {
        return invoiceDetailID;
    }

    public void setInvoiceDetailID(Integer invoiceDetailID) {
        this.invoiceDetailID = invoiceDetailID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}

//invoiceDetailID INT PRIMARY KEY AUTO_INCREMENT,
//invoiceID INT,
//productID INT,
//quantity INT,
//unitPrice DOUBLE,
//FOREIGN KEY (invoiceID) REFERENCES Invoice(invoiceID),
//FOREIGN KEY (productID) REFERENCES Product(productID)