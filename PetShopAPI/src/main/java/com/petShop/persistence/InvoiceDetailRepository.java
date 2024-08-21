package com.petShop.persistence;

import com.petShop.persistence.crud.InvoiceDetailCrudRepository;
import com.petShop.persistence.entity.InvoiceDetail;

import java.util.List;
import java.util.Optional;

public class InvoiceDetailRepository {
    private InvoiceDetailCrudRepository invoiceDetailCrudRepository;

    public List<InvoiceDetail> getAll() {
        return (List<InvoiceDetail>) invoiceDetailCrudRepository.findAll();
    }

    public Optional<InvoiceDetail> getInvoiceDetailByID(int id){
        return invoiceDetailCrudRepository.findById(id);
    }

    public InvoiceDetail save(InvoiceDetail invoiceDetail){
        return invoiceDetailCrudRepository.save(invoiceDetail);
    }

    public void delete(int id){
        invoiceDetailCrudRepository.deleteById(id);
    }
}
