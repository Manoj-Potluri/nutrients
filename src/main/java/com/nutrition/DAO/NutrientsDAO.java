package com.nutrition.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nutrition.Model.Nutrients;

import java.util.List;

public interface NutrientsDAO extends JpaRepository<Nutrients, Long> {
	
	List<Nutrients> findAll();

}
