package com.petShop.persistence;

import com.petShop.persistence.crud.SupplierCrudRepository;
import com.petShop.persistence.entity.Pet;
import com.petShop.persistence.entity.Supplier;

import java.util.List;
import java.util.Optional;

public class SupplierRepository {
    private SupplierCrudRepository supplierCrudRepository;

    public List<Supplier> getAll() {
        return (List<Supplier>) supplierCrudRepository.findAll();
    }

    public Optional<Supplier> getSupplierByID(int id){
        return supplierCrudRepository.findById(id);
    }

    public Supplier save(Supplier supplier){
        return supplierCrudRepository.save(supplier);
    }

    public void delete(int id) {
        supplierCrudRepository.deleteById(id);
    }
}
