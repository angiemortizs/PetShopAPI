package com.petShop.persistence.crud;

import com.petShop.persistence.entity.InvoiceDetail;
import org.springframework.data.repository.CrudRepository;

public interface InvoiceDetailCrudRepository extends CrudRepository<InvoiceDetail, Integer> {
}
