package com.skilldistillery.foodtruck.app;


import java.util.Scanner;

import com.skilldistillery.foodtruck.entities.FoodTruck;

public class FoodTruckApp {
	private int numTrucks = 0;
	private FoodTruck[] fleet = new FoodTruck[5];
	private int counter = 0;
	public static void main(String[] args) {
		FoodTruckApp app = new FoodTruckApp();
		app.run();
	}
	
	private void run() {
		Scanner input = new Scanner(System.in);
		createFoodTruck(input); // non static call
		displayMenu();
		printMenu(input);
		
	}
	public void createFoodTruck(Scanner input) {
		
		for (int i = 0; i < fleet.length; i++) {
			
			System.out.println("Enter the name of the food truck you'd like to rate (or type 'quit'): ");
			String name = input.next();
			if (name.equalsIgnoreCase("quit")) {
				break;
			}
			System.out.println("Enter the food category: ");
			String foodCategory = input.next();
			System.out.println("Rate the this truck on a scale of 1 to 5: ");
			int rating = input.nextInt();
			input.nextLine();// flush
			
//			fleet[i]  = new FoodTruck(name, rating, foodCategory ); 
			
			FoodTruck truck = new FoodTruck(name, rating, foodCategory);
			fleet[i] = truck;
			counter++;
		}
	}

	public void displayMenu() {
		System.out.println("Choose from the following #'s: ");
		System.out.println("1) List of all existing food trucks.\n" + "2) See the average rating of food trucks.\n"
				+ "3) Display the highest-rated food truck.\n" + "0) Quit the program.");
	}
	
	
	public void printMenu(Scanner input) {
		
		String choice = " ";
	   do {
		   choice = input.next();
		   switch(choice) {
		case "1":
			listFoodTrucks();
			
			break;
		case "2":
			ratingAvg();
			break;
		case "3":
			highestAvgs();
			break;
		case "0":
			System.out.println("Byeeeeeee!");
			if (choice.equalsIgnoreCase("0")) {
				break;
			}
		default:
			System.out.println("Thats not an option. Try again!");
			break;
		}
	   }while (!choice.equals("5"));
	   input.close();
	}
	public void ratingAvg() {  //check for null with loop & counter
		double average = 0.0;
		int sum = 0;
		for (int i = 0; i < counter; i++) {
			sum += fleet[i].getRating();
		}
		average = sum / counter;
		System.out.println("Average rating is: " + average);
	}
	private void highestAvgs() {
		
		int biggestNum = 0;
		FoodTruck truck = fleet[0];
		for (int i = 0; i < counter; i++) {
			FoodTruck topRating = fleet[i];
			if (topRating.getRating() > biggestNum) {
				biggestNum = topRating.getRating();
			}
		}
			System.out.println("Highest Rated Food Truck: " + biggestNum);
	}
	private void listFoodTrucks() {
		System.out.println("Listing foodtrucks");
		for (int i = 0; i <fleet.length; i++) {
			if (fleet[i] != null)
				System.out.println(fleet[i]);
			
		}
	}
	
}
	   
	   

	   

