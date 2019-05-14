package lambadaClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class CountryMain {
	
	static List<Country> countries = new ArrayList<>(Arrays.asList(new Country("Schweiz", 41285, 8526936),
			new Country("Germany", 357021, 82887000), new Country("France", 675417, 67345209), new Country("Austria", 83858, 8857900)));


	
	public static void main(String [] args) {
		countries.sort((c1, c2) -> Integer.compare(c1.getPopulation(), c2.getPopulation()));
	
	
		for (Country c : countries) System.out.println(c);
		
	}
	

}

