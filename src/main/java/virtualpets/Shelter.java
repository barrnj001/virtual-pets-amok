package virtualpets;

import java.util.HashMap;

public class Shelter implements TickAttack, DoglyManners {

	HashMap<String, Pets> petShelter = new HashMap<>();

	public int kittyLitter;
	public int cageStat;

	public int getLitterLevel() {
		for (Pets pet : petShelter.values()) {
			if (pet instanceof OrganicCat) {
				kittyLitter = ((OrganicCat) pet).getLitter();
			}
		}
		return kittyLitter;
	}

	public int getCageStat() {
		for (Pets pet : petShelter.values()) {
			if (pet instanceof OrganicDog) {
				cageStat = ((OrganicDog) pet).getCage();
			}
		}
		return cageStat;
	}

	public HashMap<String, Pets> shelter() {
		return petShelter;
	}

	public boolean hasPet(String pet) {
		Pets selectedPet = petShelter.get(pet);
		boolean hasPet;
		if (selectedPet == null) {
			hasPet = false;
		} else {
			hasPet = true;
		}
		return hasPet;
	}

	public HashMap<String, Pets> getAllPets() {
		return petShelter;
	}

	public Pets getPetName(String name) {
		return petShelter.get(name);
	}

	public void feedPets() {
		for (Pets pet : petShelter.values()) {
			if (pet instanceof Organic) {
				((Organic) pet).feedPet();
			}
		}
	}

	public void oilAllPets() {
		for (Pets pet : petShelter.values()) {
			if (pet instanceof Robotic) {
				((Robotic) pet).oilPet();
			}
		}
	}

	public void cleanLitterboxes() {
		for (Pets pet : petShelter.values()) {
			if (pet instanceof OrganicCat) {
				((OrganicCat) pet).clean();
			}
		}
	}

	public void cleanAllCages() {
		for (Pets pet : petShelter.values()) {
			if (pet instanceof OrganicDog) {
				((OrganicDog) pet).clean();
			}
		}
	}

	public void addPet(Pets pet) {
		petShelter.put(pet.getName(), pet);

	}

	public void adoptPet(Pets pet) {
		petShelter.remove(pet.getName(), pet);
	}

	public void waterPets() {
		for (Pets pet : petShelter.values()) {
			if (pet instanceof Organic) {
				((Organic) pet).giveWater();
			}
		}
	}

	@Override
	public void tick() {
		for (Pets pet : petShelter.values()) {
			if (pet instanceof OrganicCat) {
				((OrganicCat) pet).tick();
			}
		}
		for (Pets pet : petShelter.values()) {
			if (pet instanceof OrganicDog) {
				((OrganicDog) pet).tick();
			}
		}
		for (Pets pet : petShelter.values()) {
			if (pet instanceof RoboticDog) {
				((RoboticDog) pet).tick();
			}
		}
		for (Pets pet : petShelter.values()) {
			if (pet instanceof RoboticCat) {
				((RoboticCat) pet).tick();
			}
		}
		for (Pets pet : petShelter.values()) {
			if (pet instanceof OrganicCat) {
				if (((OrganicCat) pet).getLitter() > 20) {
					System.out
							.println("The litterbox is overflowing... yikes! The cats are starting to look unhealthy");
					pet.lowerHealth();
				}
			}
		}
		for (Pets pet : petShelter.values()) {
			if (pet instanceof OrganicDog) {
				if (((OrganicDog) pet).getCage() > 20) {
					System.out.println("Unclean cages make for unhealthy dogs...");
					pet.lowerHealth();
				}
			}
		}
		for (Pets pet : petShelter.values()) {
			if (pet instanceof OrganicDog) {
				if (((OrganicDog) pet).getBladder() > 40) {
					((OrganicDog) pet).relieveSelf();

				}
			}
		}
		for (Pets pet : petShelter.values()) {
			if (pet instanceof OrganicCat) {
				if (((OrganicCat) pet).getBladder() > 30) {
					((OrganicCat) pet).relieveSelf();
				}
			}
		}

	}

	@Override
	public void walkDog() {
		for (Pets pet : petShelter.values()) {
			if (pet instanceof OrganicDog) {
				((OrganicDog) pet).walkDog();
			}
			if (pet instanceof RoboticDog) {
				((RoboticDog) pet).walkDog();
			}
		}

	}

	public void removePet(String name) {
		petShelter.remove(name);
		
	}

}
