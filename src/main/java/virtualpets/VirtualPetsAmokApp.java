package virtualpets;

import java.util.Scanner;

public class VirtualPetsAmokApp {

	public static void main(String[] args) {
		Shelter shelter = new Shelter();
		Scanner input = new Scanner(System.in);
		String userInput = "";
		OrganicDog byakko = new OrganicDog("Byakko", 20, 20, 20, 20);
		OrganicCat alex = new OrganicCat("Alex", 20, 20, 20, 20);
		RoboticDog moogle = new RoboticDog("MoggleXI", 20);
		RoboticCat paissa = new RoboticCat("PAISSA", 20);
		shelter.addPet(paissa);
		shelter.addPet(moogle);
		shelter.addPet(alex);
		shelter.addPet(byakko);
		
		System.out.println("Oh no! The pet shelter has run amok... it's up to you to wrangle things!");
	
		System.out.println("");
		
		
		while(!userInput.equalsIgnoreCase("quit")) {
			System.out.println("Here's the status of your pets: ");
			System.out.println("");
			
			for (Pets pets : shelter.getAllPets().values()) {
				System.out.println(pets);
			}
			System.out.println("What would you like to do first?");
			System.out.println("");
			System.out.println("1. Feed organic pets.");
			System.out.println("2. Water organic pets");
			System.out.println("3. Oil robotic pets.");
			System.out.println("4. Clean cages.");
			System.out.println("5. Clean litterbox");
			System.out.println("6. Walk all dogs");
			System.out.println("Quit");
			userInput = input.nextLine();
			
			if(userInput.equals("1")) {
				shelter.feedPets();
				
			} else if (userInput.equals("2")) {
				shelter.waterPets();
			} else if (userInput.equals("3")) {
				shelter.oilAllPets();
			} else if (userInput.equals("4")) {
				shelter.cleanAllCages();
			}
		}

	}

}
