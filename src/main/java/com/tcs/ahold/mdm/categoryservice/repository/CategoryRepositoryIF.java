package com.tcs.ahold.mdm.categoryservice.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tcs.ahold.mdm.categoryservice.model.Category;

@Repository
public interface CategoryRepositoryIF extends CrudRepository<Category, String>{
	
	Optional<Category> findByCatName(String catName);

}
