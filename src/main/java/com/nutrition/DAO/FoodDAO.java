package com.nutrition.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nutrition.Model.Food;

public interface FoodDAO extends JpaRepository<Food, Long> {
	
	List<Food> findAll();

}
