package com.PetShop.persistence.crud;

import org.springframework.data.repository.CrudRepository;
import com.petShop.persistence.entity.Pet;

public interface PetCrudRepository extends CrudRepository<Pet,Integer> {
}
