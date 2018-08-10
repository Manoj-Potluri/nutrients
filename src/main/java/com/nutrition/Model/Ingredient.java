package com.nutrition.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Ingredient {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false, updatable = false)	
	private Long id;
	private String description;
	private Double weight;
	
	@ManyToMany
	@JoinColumn(name = "foodId", nullable= false)
	@NotNull
	@JsonIgnore
	private Food food;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public Food getFood() {
		return food;
	}

	public void setFood(Food food) {
		this.food = food;
	}

	@Override
	public String toString() {
		return "Ingredient [description=" + description + ", weight=" + weight + ", food=" + food + "]";
	}

	public Ingredient(String description, Double weight, @NotNull Food food) {
		super();
		this.description = description;
		this.weight = weight;
		this.food = food;
	}

	public Ingredient() {
		super();
		// TODO Auto-generated constructor stub
	}

}
