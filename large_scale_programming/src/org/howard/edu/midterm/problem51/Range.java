package org.howard.edu.midterm.problem51;


public interface Range {
	public class EmptyRangeException extends Exception {
		public EmptyRangeException(String error) {
			super(error);
		}
	}	
	public boolean contains(int value);
	public boolean overlaps( Range other ) throws EmptyRangeException; 
    // returns true if the receiver contains at least 
    // one value in common with other, and false otherwise 
    //  EmptyRangeException is thrown when a null Range object is passed to the method
	public int size(); 
    // returns the number of integers in the range
	public int getUpper();
	public int getLower();
	
	
	
}

	
	

