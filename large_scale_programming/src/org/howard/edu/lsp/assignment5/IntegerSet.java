package org.howard.edu.lsp.assignment5;
import java.util.*; 

public class IntegerSet  {
	// Hint: probably best to use an array list.  You will need to do a little research
	private ArrayList<Integer> integerSet;

	// Default Constructor
	public IntegerSet() {
		integerSet = new ArrayList<Integer>();
	}
	
	/**
	 * getter function
	 * @return ArrayList - containing all the integers in set 
	 */
	
	public ArrayList<Integer> getSet(){
		return integerSet;
	}
	
	/**
	 * setter function
	 * @param newSet IntegerSet 
	 */
	public void setSet(ArrayList<Integer> newSet) {
		integerSet = newSet;
	}

	/**
	 * Empties set using ArrayList function clear()
	 */
public void clear() {
	
	integerSet.clear();
};

/**
 * 
 * @return size of ArrayList as an int
 */
public int length() {
	return integerSet.size();
}; 

/**
 * 
 * @param b - another IntegerSet to compare to integerSet
 * @return true is both IntegerSets are equal; false if unequal
 */
public boolean equals(IntegerSet b) {
	if (b.length() != integerSet.size()) {
		return false;
	}
	else {
		return integerSet.containsAll(integerSet);
	}
}; 

/**
 * 
 * @param value - int to check if it's in the set
 * @return true if int in set, false if not in set
 */
public boolean contains(int value) {
	return integerSet.contains(value);
};    

/**
 * creating an exception that returns error string to user
 * @author LUly
 *
 */

public class IntegerSetException extends Exception{
	/**
	 * 
	 * @param error - prints String with error to user 
	 */
	
	public IntegerSetException(String error) {
		super(error);
	}
}



/**
 * 
 * @return integer - maximum value of set
 * @throws IntegerSetException if set empty
 */
public int largest() throws IntegerSetException  {
	if(integerSet.isEmpty()) {
		throw new IntegerSetException("Set is empty");
	}
	else {
		int intInSet = integerSet.get(0);
		for (int j = 1; j < integerSet.size(); j++) {
			if (intInSet < integerSet.get(j));
			intInSet = integerSet.get(j);
		}
		return intInSet;
	}
}; 

/**
 * 
 * @return integer - minimum value of set
 * @throws IntegerSetException - error if set is empty
 */
public int smallest() throws IntegerSetException {
	if(integerSet.isEmpty()) {
		throw new IntegerSetException("Set is empty");
	}
	else {
		int intInSet = integerSet.get(0);
		for(int j = 0; j < integerSet.size(); j++) {
			if(integerSet.get(j) < intInSet) {
				intInSet = integerSet.get(j);
			}
		}
		return intInSet;
	}
};

/**
 * 
 * @param item - integer to be added to set
 */
public void add(int item) {
	if(integerSet.contains(item) == false) { //if item not in set already
		integerSet.add(item);
	}
	
}; 

/**
 * 
 * @param item - integer to be removed from set
 */
public void remove(int item) {
	if(integerSet.contains(item)) {
		integerSet.remove(integerSet.indexOf(item));
	}
}; 

/**
 * 
 * @param intSetb - IntegerSet to add to integerSet
 */
public void union(IntegerSet intSetb) {
	for(int j = 0; j < intSetb.length(); j++) {
		if(integerSet.contains(intSetb.integerSet.contains(j))){
			continue;
		 }else {
			integerSet.add(intSetb.integerSet.get(j));
		}
	}
};

/**
 * 
 * @param intSetb - IntegerSet to insect with IntegerSet
 */
public void intersect(IntegerSet intSetb) {
	integerSet.retainAll(intSetb.integerSet);
}; 

/**
 * 
 * @param intSetb - IntegerSet to take difference from integerSet
 */
public void diff(IntegerSet intSetb) {
	for(int j = 0; j < intSetb.length(); j++) {
		if (integerSet.contains(intSetb.integerSet.get(j))) {
			integerSet.remove(intSetb.integerSet.get(j));
		}
	}
}; 

/**
 * 
 * @return true if the set is empty, otherwise false
 */
boolean isEmpty(){
	return integerSet.isEmpty();
};
/**
 * @return String - integerSet in string format
 */
public String toString() {
	String strIntSet = "";
	for(int j = 0; j < integerSet.size(); j++) {
		strIntSet += integerSet.get(j).toString()+", ";
	}
	return strIntSet;
};	
}
