package virtualpets;

import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ShelterTest {
	
	Shelter shelter = new Shelter();
	@Test
	public void shouldBeAbleToAddPets() {
		OrganicDog dog = new OrganicDog("max", 0);
		RoboticCat cat = new RoboticCat("machi", 1);
		shelter.addPet(cat);
		String catName = cat.getName();
		String dogName = dog.getName();
		assertTrue(catName.equals("machi"));
		assertTrue(dogName.equals("max"));
	}
	@Test
	public void shouldBeAbleToFeedPets() {
		OrganicDog dog = new OrganicDog("max", 0);
		OrganicCat cat = new OrganicCat("alex", 0);
		shelter.addPet(dog);
		shelter.addPet(cat);
		int dogHungerBefore = dog.getHunger();
		int catHungerBefore = cat.getHunger();
		shelter.feedPets();
		int dogHungerAfter = dog.getHunger();
		int catHungerAfter = cat.getHunger();
		assertThat(dogHungerBefore, lessThan(dogHungerAfter));
		assertThat(catHungerBefore, lessThan(catHungerAfter));
		//HOt!!!
	}
	@Test
	public void shouldBeAbleToOilAllPets() {
		
	}

}
