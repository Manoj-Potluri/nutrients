package com.nutrition.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.nutrition.DAO.IngredientsDAO;
import com.nutrition.Model.Ingredient;

public class IngredientsServiceImpl implements IngredientsService {
	
	@Autowired
	private IngredientsDAO ingredinetDAO;

	@Override
	public Ingredient createIngredients(Ingredient ingredient) {
		return IngredientsDAO.save(ingredient);
	}

	@Override
	public List<Ingredient> getAllIngredient() {
		return IngredientsDAO.findAll();
	}
	
	

}
