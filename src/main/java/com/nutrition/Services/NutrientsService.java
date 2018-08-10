package com.nutrition.Services;

import java.util.List;

import com.nutrition.Model.Nutrients;

public interface NutrientsService {
	
	Nutrients createNutrient(Nutrients nutrient);
	
	List<Nutrients> getAllNutrients();

}
