package org.howard.edu.lsp.assignment4;
import org.howard.edu.lsp.assignment4.IntegerSet.IntegerSetException;;

/**
 * Driver class to run test cases of IntegerSet class
 * @author LUly
 *
 */
public class IntegerSetDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			IntegerSet set1 = new IntegerSet();
			System.out.println(set1);
			for (int i = 1; i<=15;i++) {
				set1.add(i);
			}
			System.out.println(set1);
			
			System.out.println("Minimum value of set 1 is " + set1.smallest());
			System.out.println("Max value of set 1 is " + set1.largest());
			System.out.println("Set 1 is: " + set1.toString());
			
			System.out.println("Length before removing items: " + set1.length());
			
			System.out.println("Before removing 5:" + set1.toString());
			set1.remove(5);
			System.out.println("After removing 5: " + set1.toString());

			
			
			System.out.println("Before removing 9: " + set1.toString());
			set1.remove(9);
			System.out.println("After removing 9: " + set1.toString());
			
			
			System.out.println("Before removing 100:"+ set1.toString());
			set1.remove(100);
			System.out.println("After removing 100:" + set1.toString());
			
			System.out.println("Before removing 0:"+ set1.toString());
			set1.remove(0);
			System.out.println("After removing 0:" + set1.toString());
			
			
			System.out.println("Set 1 after removing items" + set1.length());
			
			//isEmpty()
			System.out.println("Is set 1 empty?");
			set1.isEmpty(); //false
			
			//contains()
			System.out.println("Is 13 in set 1?");
			System.out.println(set1.contains(13)); //true
			System.out.println("Is 100 in set 1?");
			set1.contains(100); //false
			
			set1.clear();
			System.out.println("Is set 1 empty?");
			System.out.println(set1.isEmpty());
			for(int i = 1; i<= 10; i++) {
				set1.add(i);
			}
			
			IntegerSet set2 = new IntegerSet();
			for (int i =0; i <= 30; i+=3) {
				set2.add(i);
			}
			System.out.println("Set 1: " + set1.toString());
			System.out.println("Set 2:" + set2.toString());
			
			set2.clear();
			
			System.out.println("Empty Set 2:" + set2.toString());
			for (int i =0; i <= 30; i+=3) {
				set2.add(i);
			}
			
			System.out.println("Set 2 with values:" + set2.toString());

		
			System.out.println("Set difference of set 2 and set 1");
			set2.diff(set1);
			
			System.out.println(set2.toString());
			set2.clear();
			
			for (int i =0; i <= 30; i+=3) {
				set2.add(i);
			}
			
			
			System.out.println("Are set 1 and 2 equal?");
			System.out.println(set1.equals(set2));
			
			
			System.out.println("Intersection of set 1 and 2 ");
			set2.intersect(set1);
			
			System.out.println(set2.toString());
			
			set2.clear();
			for (int i =0; i <= 30; i+=3) {
				set2.add(i);
			}
			
			
			System.out.println("Union of set 1 and 2");
			set2.union(set1);
			System.out.println(set2.toString());
			
			set2.clear();
			for (int i =0; i <= 30; i+=3) {
				set2.add(i);
			}
			
			System.out.println("Union of set 1 and set 1 ");
			set1.union(set1);
			System.out.println(set1.toString());
			
			set1.clear();
			System.out.println("Catching exception");
			System.out.println(set1.largest());
			System.out.println(set1.smallest());
			
			
			
			
			
			

			
			
			
			
			
			
			
		}
		catch(IntegerSetException error) {
			System.out.println(error);
		}
		
		
	}

}
