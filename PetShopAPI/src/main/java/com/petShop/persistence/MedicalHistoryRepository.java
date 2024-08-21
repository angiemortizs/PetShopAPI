package com.petShop.persistence;

import com.petShop.persistence.crud.MedicalHistoryCrudRepository;
import com.petShop.persistence.entity.InvoiceDetail;
import com.petShop.persistence.entity.MedicalHistory;

import java.util.List;
import java.util.Optional;

public class MedicalHistoryRepository {
    private MedicalHistoryCrudRepository medicalHistoryCrudRepository;

    public List<MedicalHistory> getAll() {
        return (List<MedicalHistory>) medicalHistoryCrudRepository.findAll();
    }

    public Optional<MedicalHistory> getMedicalHistoryByID(int id){
        return medicalHistoryCrudRepository.findById(id);
    }

    public MedicalHistory save(MedicalHistory medicalHistory){
        return medicalHistoryCrudRepository.save(medicalHistory);
    }

    public void delete(int id){
        medicalHistoryCrudRepository.deleteById(id);
    }
}
