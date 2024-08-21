package com.petShop.persistence.crud;

import com.petShop.persistence.entity.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeCrudRepository extends CrudRepository<Employee,Integer> {
}