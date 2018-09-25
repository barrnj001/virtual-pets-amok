package virtualpets;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class AmokTest {
	Shelter shelter = new Shelter();
	@Test
	public void petShouldHaveName() {
		OrganicDog testDog = new OrganicDog("Spike", 0, 0, 0, 0);
		String testName = testDog.getName();
		assertThat(testName, is("Spike"));

	}
	@Test
	public void shouldBeAbleToAssignType() {
		OrganicDog testDog = new OrganicDog("Spike", 0, 0, 0, 0);
		assertTrue(testDog instanceof OrganicDog);
	}


	@Test
	public void shouldBeAbleToHaveOrganicCat() {
		OrganicCat cat = new OrganicCat("Alex", 0, 0, 0, 0);
		shelter.addPet(cat);
		String catName = cat.getName();
		assertTrue(shelter.hasPet(catName));
		
	}

}
