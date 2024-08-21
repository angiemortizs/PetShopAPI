package com.petShop.persistence;

import com.petShop.persistence.crud.VeterinarianCrudRepository;
import com.petShop.persistence.entity.Pet;
import com.petShop.persistence.entity.Veterinarian;

import java.util.List;
import java.util.Optional;

public class VeterinarianRepository {
    private VeterinarianCrudRepository veterinarianCrudRepository;

    public List<Veterinarian> getAll() {
        return (List<Veterinarian>) veterinarianCrudRepository.findAll();
    }

    public Optional<Veterinarian> getVeterinarianByID(int id){
        return veterinarianCrudRepository.findById(id);
    }

    public Veterinarian save(Veterinarian veterinarian){
        return veterinarianCrudRepository.save(veterinarian);
    }

    public void delete(int id) {
        veterinarianCrudRepository.deleteById(id);
    }
}
