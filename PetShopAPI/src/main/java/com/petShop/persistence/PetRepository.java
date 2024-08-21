package com.petShop.persistence;

import com.petShop.persistence.crud.PetCrudRepository;
import com.petShop.persistence.entity.Pet;
import java.util.List;
import java.util.Optional;

public class PetRepository {
    private PetCrudRepository petCrudRepository;

    //CRUDS

    public List<Pet> getAll() {
        return (List<Pet>) petCrudRepository.findAll();
    }

    public Optional<Pet> getPetByID(int id) {
        return petCrudRepository.findById(id);
    }

    public Pet save(Pet pet) {
        return petCrudRepository.save(pet);
    }

    public void delete(int id) {
        petCrudRepository.deleteById(id);
    }
// Querys

    public boolean existsPet(int id) {
        return petCrudRepository.existsById(id);
    }

    public long countAll() {
        return petCrudRepository.count();
    }
}

