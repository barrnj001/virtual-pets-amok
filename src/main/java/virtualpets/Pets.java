package virtualpets;

public abstract class Pets {
	public String name;
	protected int health = 50;

	Pets(String name, int health) {
		this.name = name;
		this.health = health;
	}

	public String getName() {
		return name;
	}
	public int getHealth() {
		return health;
	}

	public void lowerHealth() {
		health -= 2;
		
	}

}
