package virtualpets;

import java.util.HashMap;

public class Shelter implements TickAttack{
	
	HashMap<String, Pets> petShelter = new HashMap<>();
	
	public HashMap<String, Pets> shelter(){
		return petShelter;
	}
	
	public HashMap<String, Pets> getAllPets(){
		return petShelter;
	}
	
	public Pets getPetName(String name) {
		return petShelter.get(name);
	}
	public void feedPets() {
		for (Pets pet: petShelter.values()){
			if (pet instanceof Organic) {
				((Organic) pet).feedPet();
			}
		}
	}
	public void oilAllPets() {
		for(Pets pet : petShelter.values()) {
			if(pet instanceof Robotic) {
				((Robotic)pet).oilPet();
			}
		}
	}
	public void cleanLitterboxes() {
		for(Pets pet : petShelter.values()) {
			if(pet instanceof OrganicCat) {
				((OrganicCat)pet).clean();
			}
		}
	}
	public void cleanAllCages() {
		for(Pets pet : petShelter.values()) {
			if(pet instanceof OrganicDog) {
				((OrganicDog)pet).clean();
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
		for (Pets pet: petShelter.values()){
			if (pet instanceof Organic) {
				((Organic) pet).giveWater();
			}
		}
	}

	@Override
	public void tick() {
		for(Pets pet : petShelter.values()) {
			((OrganicDog)pet).tick();
			((OrganicCat)pet).tick();
			((RoboticDog)pet).tick();
			((RoboticCat)pet).tick();
		}
		
	}

}
