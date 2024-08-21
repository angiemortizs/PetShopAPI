package com.petShop.persistence;

import com.petShop.persistence.crud.OwnerCrudRepository;
import com.petShop.persistence.entity.MedicalHistory;
import com.petShop.persistence.entity.Owner;

import java.util.List;
import java.util.Optional;

public class OwnerRepository {
    private OwnerCrudRepository ownerCrudRepository;

    public List<Owner> getAll(){
        return (List<Owner>) ownerCrudRepository.findAll();
    }

    public Optional<Owner> getOwnerByID(int id){
        return ownerCrudRepository.findById(id);
    }

    public Owner save(Owner owner){
        return ownerCrudRepository.save(owner);
    }

    public void delete(int id) {
        ownerCrudRepository.deleteById(id);
    }
}

