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
public class Nutrients {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false, updatable = false)
	private Long id;
	private String label;
	private Double quantity;
	private String unit;
	
	@ManyToMany
	@JoinColumn(name = "foodId", nullable= false)
	@NotNull
	@JsonIgnore
	private Food food;

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public Double getQuantity() {
		return quantity;
	}

	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public Food getFood() {
		return food;
	}

	public void setFood(Food food) {
		this.food = food;
	}

	@Override
	public String toString() {
		return "Nutrients [label=" + label + ", quantity=" + quantity + ", unit=" + unit + ", food=" + food + "]";
	}

	public Nutrients(String label, Double quantity, String unit, @NotNull Food food) {
		super();
		this.label = label;
		this.quantity = quantity;
		this.unit = unit;
		this.food = food;
	}

	public Nutrients() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
