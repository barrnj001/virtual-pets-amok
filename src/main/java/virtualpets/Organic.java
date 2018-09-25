package virtualpets;

public abstract class Organic extends Pets{
	
	Organic(String name, int health) {
		super(name, health);
	}
	protected int hunger = 20;
	protected int bladder = 20;
	protected int thirst = 20;


	public void feedPet() {
		hunger += 10;
		bladder += 5;
		thirst -= 5;
	}
	
	public void giveWater() {
		thirst += 15;
		bladder += 5;
	}
	public void relieveSelf() {
		
	}
	public int getHunger() {
		return hunger;
	}
	public int getBladder() {
		return bladder;
	}
	public int getThirsty() {
		return thirst;
	}

}
