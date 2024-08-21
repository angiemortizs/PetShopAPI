package com.petShop.persistence;

import com.petShop.persistence.crud.EmployeeCrudRepository;
import com.petShop.persistence.entity.Employee;

import java.util.List;
import java.util.Optional;

public class EmployeeRepository {
    private EmployeeCrudRepository employeeCrudRepository;

    public List<Employee> getAll(){
        return (List<Employee>) employeeCrudRepository.findAll();
    }

    public Optional<Employee> getEmployeeByID(int id){
        return employeeCrudRepository.findById(id);
    }

    public Employee save(Employee employee){
        return employeeCrudRepository.save(employee);
    }

    public void delete(int id){
        employeeCrudRepository.deleteById(id);
    }
}
