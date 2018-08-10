package com.nutrition.Services;

import java.util.List;

import com.nutrition.Model.Ingredient;

public interface IngredientsService {
	
	Ingredient createIngredients(Ingredient ingredient);
	
	List<Ingredient> getAllIngredient();

}
