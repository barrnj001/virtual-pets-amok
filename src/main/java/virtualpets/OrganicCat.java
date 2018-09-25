package virtualpets;

public class OrganicCat extends Organic implements OrganicNeeds, TickAttack{
	private int litterBox = 0;

	OrganicCat(String name, int health, int hunger, int bladder, int thirst) {
		super(name, health, hunger, bladder, thirst);

	}
	public int getLitter() {
		return litterBox;
	}
	@Override
	public String toString() {
		return "Name: " + name + "\tHealth: " + health + "\tHunger: " + hunger + "\tBladder: " + bladder + "\tThirst: " + thirst;
	}

	@Override
	public void relieveSelf() {
		litterBox += 10;
		health -= 10;
		
	}

	@Override
	public void clean() {
		litterBox = 0;
		
	}
	@Override
	public void tick() {
		health -= 5;
		litterBox -= 5;
		hunger -= 5;
		
	}

}
