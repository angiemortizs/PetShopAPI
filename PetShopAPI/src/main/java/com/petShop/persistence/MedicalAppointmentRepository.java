package com.petShop.persistence;

import com.petShop.persistence.crud.MedicalAppointmentCrudRepository;
import com.petShop.persistence.entity.MedicalAppointment;

import java.util.List;
import java.util.Optional;

public class MedicalAppointmentRepository {
    private MedicalAppointmentCrudRepository medicalAppointmentCrudRepository;

    public List<MedicalAppointment> getAll (){
        return (List<MedicalAppointment>) medicalAppointmentCrudRepository.findAll();
    }

    public Optional<MedicalAppointment> getMedicalAppointmentByID(int id){
        return medicalAppointmentCrudRepository.findById(id);
    }

    public MedicalAppointment save(MedicalAppointment medicalAppointment){
        return medicalAppointmentCrudRepository.save(medicalAppointment);
    }

    public void delete(int id){
        medicalAppointmentCrudRepository.deleteById(id);
    }
}
