package com.petShop.persistence.crud;

import com.petShop.persistence.entity.Supplier;
import org.springframework.data.repository.CrudRepository;

public interface SupplierCrudRepository extends CrudRepository<Supplier,Integer> {
}
