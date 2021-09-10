package com.company.akira.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;
@NoRepositoryBean
public interface CategoryRepository<E> extends CrudRepository<E,Long> {
}
