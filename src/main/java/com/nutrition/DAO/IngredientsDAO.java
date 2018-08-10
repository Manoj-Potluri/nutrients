package com.nutrition.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nutrition.Model.Ingredient;

public interface IngredientsDAO extends JpaRepository<Ingredient, Long> {
	
	List<Ingredient> findAll();

}
