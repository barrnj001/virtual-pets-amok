package virtualpets;

public class OrganicCat extends Organic implements OrganicNeeds, TickAttack{
	private int litterBox = 0;

	OrganicCat(String name, int health) {
		super(name, health);

	}
	public int getLitter() {
		return litterBox;
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
