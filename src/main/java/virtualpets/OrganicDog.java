package virtualpets;

public class OrganicDog extends Organic implements OrganicNeeds, DoglyManners, TickAttack {
	private int cage = 0;

	OrganicDog(String name, int health, int hunger, int bladder, int thirst) {
		super(name, health, hunger, bladder, thirst);
	}
	public int getCage() {
		return cage;
	}
	@Override
	public String toString() {
		return "Name: " + name + "\tHealth: " + health + "\tHunger: " + hunger + "\tBladder: " + bladder + "\tThirst: " + thirst + "\tCage: " + cage;
	}
	@Override
	public void relieveSelf() {
		cage += 10;
		health -= 10;
		bladder -= 20;
	}
	@Override
	public void clean() {
		cage = 0;
		
	}
	@Override
	public void walkDog() {
		health += 10;
		bladder -= 10;
		cage -= 3;
		
	}
	@Override
	public void tick() {
		health -= 15;
		bladder += 5;
		cage += 5;
		hunger -= 5;
		
	}

}
