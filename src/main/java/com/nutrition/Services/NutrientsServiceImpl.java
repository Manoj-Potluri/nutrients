package com.nutrition.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.nutrition.DAO.NutrientsDAO;
import com.nutrition.Model.Nutrients;

public class NutrientsServiceImpl implements NutrientsService {
	
	@Autowired
	private NutrientsDAO nutrientsDAO;

	@Override
	public Nutrients createNutrient(Nutrients nutrient) {
		return NutrientsDAO.save(nutrient);
	}

	@Override
	public List<Nutrients> getAllNutrients() {
		return NutrientsDAO.findAll();
	}

}
