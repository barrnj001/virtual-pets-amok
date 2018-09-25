package virtualpets;

public abstract class Robotic extends Pets {

	Robotic(String name, int health) {
		super(name, health);
	}

	protected int oil = 20;

	public int getOil() {
		return oil;
	}

	public void oilPet() {
		oil += 30;
		health += 40;
	}

}
