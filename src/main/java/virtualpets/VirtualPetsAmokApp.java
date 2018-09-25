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
		shelter.addPet(byakko);
		shelter.addPet(moogle);
		shelter.addPet(alex);
		shelter.addPet(paissa);

		System.out.println("Oh no! The pet shelter has run amok... it's up to you to wrangle things!");

		System.out.println("");

		while (!userInput.equalsIgnoreCase("quit")) {
			
			int litterLevel = shelter.getLitterLevel();

			System.out.println("Here's the status of your pets: ");
			System.out.println("");

			for (Pets pets : shelter.getAllPets().values()) {
				System.out.println(pets);
			}
			System.out.println("What would you like to do?");
			System.out.println("");
			System.out.println("1. Feed organic pets.");
			System.out.println("2. Water organic pets.");
			System.out.println("3. Oil robotic pets.");
			System.out.println("4. Clean cages.");
			System.out.println("5. Clean communal litterbox.");
			System.out.println("6. Walk all dogs.");
			System.out.println("7. Admit a pet.");
			System.out.println("8. Adopt a pet.");
			System.out.println("Litterbox level: " + litterLevel);
			System.out.println("Quit");
			userInput = input.nextLine();

			if (userInput.equals("1")) {
				shelter.feedPets();

			} else if (userInput.equals("2")) {
				shelter.waterPets();
			} else if (userInput.equals("3")) {
				shelter.oilAllPets();
			} else if (userInput.equals("4")) {
				shelter.cleanAllCages();
			} else if (userInput.equals("5")) {
				shelter.cleanLitterboxes();
			} else if (userInput.equals("6")) {
				shelter.walkDog();
			} else if (userInput.equals("7")) {
				System.out.println("What is the name of the pet you'd like to admit?");
				String petName = input.nextLine();
				if (shelter.hasPet(petName)){
					System.out.println("That pet is already in the shelter...");
					continue;
				}
				System.out.println("What type of pet is it? Organic robotic dog or cat?");
				String petType = input.nextLine();
				if(petType.equalsIgnoreCase("robotic cat")) {
					shelter.addPet(new RoboticCat(petName, 20));
					
				} else if(petType.equalsIgnoreCase("robotic dog")) {
					shelter.addPet(new RoboticDog(petName, 20));
					
				} else if(petType.equalsIgnoreCase("organic cat")) {
					shelter.addPet(new OrganicCat(petName, 20, 20, 20, 20));
					
				} else if(petType.equalsIgnoreCase("organic dog")) {
					shelter.addPet(new OrganicDog(petName, 20, 20, 20, 20));
				} else {
					System.out.println("That's not a valid pet type! Example: robotic dog");
				}
			} else if (userInput.equals("8")) {
				System.out.println("Which pet would you like to adopt?");
				String petAdopt = input.nextLine();
				if(!shelter.hasPet(petAdopt)) {
					System.out.println("That pet does not exist...");
					continue;
				}
				shelter.removePet(petAdopt);
			}
			shelter.tick();
		}

	}

}
