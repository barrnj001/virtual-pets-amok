package virtualpets;

public class RoboticCat extends Robotic implements TickAttack {

	RoboticCat(String name, int health) {
		super(name, health);
	}
	@Override
	public String toString() {
		return "Name: " + name + "\tHealth: " + health + "\tOil: " + oil;
	}
	@Override
	public void tick() {
		oil -= 5;
		health -= 5;
		
	}

}
