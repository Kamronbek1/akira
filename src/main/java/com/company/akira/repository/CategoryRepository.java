package com.company.akira.repository;

import com.company.akira.model.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.Optional;
@NoRepositoryBean
public interface CategoryRepository<E extends Category> extends CrudRepository<E,Long> {
}
