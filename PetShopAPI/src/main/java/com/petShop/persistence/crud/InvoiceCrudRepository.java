package com.petShop.persistence.crud;

import com.petShop.persistence.entity.Invoice;
import org.springframework.data.repository.CrudRepository;

public interface InvoiceCrudRepository extends CrudRepository<Invoice,Integer> {
}