package virtualpets;

public abstract class Pets {
	private String name;

	Pets(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}
