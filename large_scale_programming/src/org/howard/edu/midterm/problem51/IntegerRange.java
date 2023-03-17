package org.howard.edu.midterm.problem51;

public class IntegerRange implements Range {
	private int lower;
   	private int upper;

	// Hint: implement getters for lower and upper

   	 IntegerRange(int lower, int upper) { 	// Constructor
        		this.lower = lower;
        		this.upper = upper;
   	 }
	public boolean contains(int value) {
		// implement
		if (getUpper() >= value && getLower() <= value) {
			return true; 
		}
		else {
			return false;
		}
	}
	public boolean overlaps(Range other) throws EmptyRangeException {
		// implement
		boolean result = true;
		if (other == null) {
			throw new EmptyRangeException("Range is empty");
		}
		else {
			if ((other.getLower() <= getLower() && (other.getUpper() >= getUpper() || other.getUpper() <= getUpper()))){
				if (other.getUpper() < getLower()) {
					result = false;
				}
			}
			
			else if (other.getLower() >= getLower() && (other.getUpper() >= getUpper() || other.getUpper() <= getUpper())){
				if (getUpper() < other.getLower()) {
					result = false;
				}
				
		}
			else {
				result = false;
			}
	}
	return result;
}


	public int size()  {
		// implement
		int size = getUpper() - getLower();
		return size; 
	}
	
	public int getLower() {
		return lower;
	}
	
	public int getUpper() {
		return upper;
	}

}
		
	
