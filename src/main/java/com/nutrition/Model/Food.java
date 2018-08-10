package com.nutrition.Model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Entity
public class Food {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "foodId", nullable = false, updatable = false)
	private Long id;
	
	private String foodName;
	
	@OneToMany(mappedBy = "food", cascade = CascadeType.ALL, orphanRemoval = true)
	@LazyCollection(LazyCollectionOption.TRUE)
	private Ingredient ingredient;
	
	@OneToMany(mappedBy = "food", cascade = CascadeType.ALL, orphanRemoval = true)
	@LazyCollection(LazyCollectionOption.TRUE)
	private Nutrients nutrients;

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public Ingredient getIngredient() {
		return ingredient;
	}

	public void setIngredient(Ingredient ingredient) {
		this.ingredient = ingredient;
	}

	public Nutrients getNutrients() {
		return nutrients;
	}

	public void setNutrients(Nutrients nutrients) {
		this.nutrients = nutrients;
	}

	@Override
	public String toString() {
		return "Food [foodName=" + foodName + ", ingredient=" + ingredient + ", nutrients=" + nutrients + "]";
	}

	public Food(String foodName, Ingredient ingredient, Nutrients nutrients) {
		super();
		this.foodName = foodName;
		this.ingredient = ingredient;
		this.nutrients = nutrients;
	}

	public Food() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
