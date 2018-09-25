package virtualpets;

public class OrganicDog extends Organic implements OrganicNeeds, DoglyManners, TickAttack {
	private int cage = 0;

	OrganicDog(String name, int health) {
		super(name, health);
	}
	public int getCage() {
		return cage;
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
