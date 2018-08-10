package com.nutrition.Services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nutrition.DAO.FoodDAO;
import com.nutrition.Model.Food;

@Service
@Transactional
public class FoodServiceImp implements FoodService {
	
	@Autowired
	private FoodDAO foodDAO;

	@Override
	public Food createFood(Food food) {
		return foodDAO.save(food);
	}

	@Override
	public List<Food> getAllFood() {
		return foodDAO.findAll();
	}
	
	
	

}
