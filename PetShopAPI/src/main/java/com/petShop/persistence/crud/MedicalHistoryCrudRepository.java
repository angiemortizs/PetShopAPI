package com.petShop.persistence.crud;

import com.petShop.persistence.entity.MedicalHistory;
import org.springframework.data.repository.CrudRepository;

public interface MedicalHistoryCrudRepository extends CrudRepository<MedicalHistory,Integer> {
}
