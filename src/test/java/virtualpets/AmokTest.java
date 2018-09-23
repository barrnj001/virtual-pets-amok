package virtualpets;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class AmokTest {
	List<Pets> pets = new ArrayList<Pets>();
	@Test
	public void petShouldHaveName() {
		OrganicDog testDog = new OrganicDog("Spike");
		String testName = testDog.getName();
		assertThat(testName, is("Spike"));

	}
	@Test
	public void shouldBeAbleToAssignType() {
		OrganicDog testDog = new OrganicDog("Spike");
		assertTrue(testDog instanceof OrganicDog);
	}

	@Test
	public void shouldBeAbleToCreateList() {
		// Arrange
		boolean pets = new ArrayList<Pets>().isEmpty();
		// Act
		assertThat(pets, is((true)));
		// Assert
		// Asserting that the new array list, pets, exists by checking if it is empty
	}

	@Test
	public void shouldBeAbleToAddPet() {
		// Arrange
		
		OrganicDog dog = new OrganicDog("Johnny");
		// Act
		pets.add(dog);
		// Assert
		assertTrue(pets.contains(dog));
	}
	@Test
	public void shouldBeAbleToHaveOrganicCat() {
		OrganicCat cat = new OrganicCat("Alex");
		pets.add(cat);
		assertTrue(pets.contains(cat));
		
	}

}
