package com.petShop.persistence.crud;

import com.petShop.persistence.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductCrudRepository extends CrudRepository<Product,Integer> {
}
