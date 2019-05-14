package familyTest;

public class Person {
	private static int nextID = 0;
	
	private int ID;
	private String name;
	private double height;
	private double weight;
	
	private static int getNextID() {
		return nextID++;
	}
	
	public Person(String name, double height, double weight) {
		this.ID = getNextID();
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	public double getBMI() {
		return weight / (height * height);
	}

	// Getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getID() {
		return ID;
	}	
}
