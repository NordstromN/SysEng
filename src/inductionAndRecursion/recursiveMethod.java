package inductionAndRecursion;

public class recursiveMethod {

	public int triangle (int row) {
		
		if (row == 1) {
			return 1;
			
		}else {
				return row + triangle(row -1);
			}
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
}
