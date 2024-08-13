package com.PetShop.persistence;

import com.PetShop.persistence.crud.PetCrudRepository;
import com.petShop.persistence.entity.Pet;
import java.util.List;
import java.util.Optional;

public class PetRepository {
    private PetCrudRepository petCrudRepository;

    public List<Pet> getAll(){
        return (List<Pet>) petCrudRepository.findAll();
    }
    public Optional<Pet> getPetByID(int id){
        return petCrudRepository.findById(id);
    }
    public Pet save(Pet pet){
        return petCrudRepository.save(pet);
    }
    public void delete(int id){
        petCrudRepository.deleteById(id);
    }
}

