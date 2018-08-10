package com.nutrition.Services;

import java.util.List;

import com.nutrition.Model.Food;

public interface FoodService {
	
	Food createFood(Food food);
	
	List<Food> getAllFood();

}
