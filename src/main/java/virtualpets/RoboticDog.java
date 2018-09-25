package virtualpets;

public class RoboticDog extends Robotic implements DoglyManners, TickAttack{

	RoboticDog(String name, int health) {
		super(name, health);
		
	}
	@Override
	public String toString() {
		return "Name: " + name + "\tHealth: " + health + "\tOil: " + oil;
	}

	@Override
	public void walkDog() {
		health += 10;
		oil -= 10;
		
	}

	@Override
	public void tick() {
		oil -= 5;
		health -= 5;
		
	}

}
