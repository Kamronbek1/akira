package com.company.akira.repository;

import com.company.akira.model.Product;
import org.springframework.data.repository.CrudRepository;

/**
 * @author User
 */

public interface ProductRepository extends CrudRepository<Product, Long> {

    Product findById(Integer id);

}
