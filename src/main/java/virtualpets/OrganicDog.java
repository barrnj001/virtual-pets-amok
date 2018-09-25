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
		return "Name: " + name + "\tHealth: " + health + "\tHunger: " + hunger + "\tBladder: " + bladder + "\tThirst: " + thirst;
	}
	@Override
	public void relieveSelf() {
		cage += 10;
		health -= 10;
	}
	@Override
	public void clean() {
		cage -= 10;
		
	}
	@Override
	public void walkDog() {
		health += 10;
		bladder -= 10;
		
	}
	@Override
	public void tick() {
		health -= 5;
		bladder += 5;
		cage += 5;
		hunger -= 5;
		
	}

}
