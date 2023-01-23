package com.skilldistillery.foodtruck.app;


import java.util.Scanner;

import com.skilldistillery.foodtruck.entities.FoodTruck;

public class FoodTruckApp {
	private int numTrucks;
	private FoodTruck[] fleet = new FoodTruck[5];

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		FoodTruckApp ftapp = new FoodTruckApp();
		ftapp.createFoodTruck(input); // non static call
		ftapp.displayMenu();
		ftapp.printMenu(input);
	
	}

	public void createFoodTruck(Scanner input) {
		
		for (int i = 0; i < fleet.length; i++) {

			System.out.println("Enter the name of the food truck you'd like to rate (or type 'quit'): ");
			String name = input.next();
			fleet[i].setName(name);
			if (name.equalsIgnoreCase("quit")) {
				break;
			}
			System.out.println("Enter the food category: ");
			String foodCategory = input.next();
			fleet[i].setFoodCategory(foodCategory);
			System.out.println("Rate the this truck on a scale of 1 to 5: ");
			int rating = input.nextInt();
			fleet[i].setRating(rating);
			input.nextLine();// flush
			
			fleet[i] = new FoodTruck(name, rating, foodCategory ); 
		
		}
	}

	public void displayMenu() {
		System.out.println("Choose from the following #'s: ");
		System.out.println("1) List of all existing food trucks.\n" + "2) See the average rating of food trucks.\n"
				+ "3) Display the highest-rated food truck.\n" + "0) Quit the program.");
	}
	
	
	public void printMenu(Scanner input) {
		
		String choice = " ";
		FoodTruckApp menu = new FoodTruckApp();
		FoodTruck truck = new FoodTruck();

	   do {
		   choice = input.next();
		   switch(choice) {
		case "1":
			menu.listFoodTrucks(menu);
			
			break;
		case "2":
			menu.ratingAvg();
			break;
		case "3":
			menu.highestAvg();
			break;
		case "0":
			System.out.println("Byeeeeeee!");
			break;
		default:
			System.out.println("Thats not an option. Try again!");
			break;
		}
	   }while (!choice.equals("5"));
	   input.close();
	}
	public void ratingAvg() {
		System.out.println("I work do worry");
		
	}
	public void highestAvg() {
		System.out.println("I work do worry");
		
	}
	private void listFoodTrucks(FoodTruckApp FoodTruck) {
		System.out.println("Listing foodtrucks");
		for (int i = 0; i <fleet.length; i++) {
			if (FoodTruck.fleet[i] != null)
				System.out.println(FoodTruck.fleet[i]);
			
		}
	}
}
	   
	   

