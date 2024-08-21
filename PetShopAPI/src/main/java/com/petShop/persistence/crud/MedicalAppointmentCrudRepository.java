package com.petShop.persistence.crud;

import com.petShop.persistence.entity.MedicalAppointment;
import org.springframework.data.repository.CrudRepository;

public interface MedicalAppointmentCrudRepository extends CrudRepository<MedicalAppointment,Integer> {
}
