package com.nutrition.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nutrition.Model.Food;
import com.nutrition.Services.FoodService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class FoodController {
	
	@Autowired
	FoodService foodService;
	
	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Food>> getAllFood(){
		List<Food> food = foodService.getAllFood();
		return new ResponseEntity<List<Food>>(food, HttpStatus.OK);
	}

}
