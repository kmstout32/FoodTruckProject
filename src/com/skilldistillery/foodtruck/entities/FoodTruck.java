package com.skilldistillery.foodtruck.entities;

public class FoodTruck {
	private static int nextTruckId = 0;//counter
	private int id; 
	private String name;
	private int rating;
	private String foodCategory;
	
	
	public FoodTruck() {
		
	}
	//constructor
	public FoodTruck(String name, int rating, String foodCategory) {
		this.name = name; 
		this.foodCategory = foodCategory;
		this.rating = rating;
		nextTruckId++;
		this.id = nextTruckId;
	}

	
	
	@Override
	public String toString() {
		return "FoodTruck [id=" + id + ", name=" + name + ", rating=" + rating + ", foodCategory=" + foodCategory + "]";
	}

	public int getNextTruckId() {
		return nextTruckId;
	}
	public void setNextTruckId(int nextTruckId) {
		FoodTruck.nextTruckId = nextTruckId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFoodCategory() {
		return foodCategory;
	}
	public void setFoodCategory(String foodCategory) {
		this.foodCategory = foodCategory;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rate) {
		this.rating = rate;
	}
}
