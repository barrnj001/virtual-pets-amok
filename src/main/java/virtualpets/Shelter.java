package virtualpets;

import java.util.HashMap;

public class Shelter {
	
	HashMap<String, Pets> petShelter = new HashMap<>();
	
	public HashMap<String, Pets> shelter(){
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

}
