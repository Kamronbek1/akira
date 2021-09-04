package com.company.akira.repository;

import com.company.akira.model.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CategoryRepository<E extends Category> extends CrudRepository<E,Long> {
}
