package lambadaClass;

public class Country implements Comparable<Country> {
	private final String name; // Unique ID
	private String capital = null;
	private double area = 0;
	private int population = 0;
	private double gdp = 0;
	private String tld = null;

	public Country(String name, double area, int population) {
		this.name = name;
		this.area = area;
		this.population = population;
	}
	
	public Country(String name, double area) {
		this.name = name;
		this.area = area;
	}

	/** Natural order for this class is to sort by name */
	@Override
	public int compareTo(Country c) {
		return name.compareTo(c.name);
	}

	@Override
	public String toString() {
		return String.format("%s (area %.2f km2, population %d)", name, area, population);
	}

	// Getters and setters
	
	public String getName() {
		return name;
	}

	public String getCapital() {
		return capital;
	}

	public double getArea() {
		return area;
	}

	public int getPopulation() {
		return population;
	}

	public double getGdp() {
		return gdp;
	}

	public String getTld() {
		return tld;
	}
}