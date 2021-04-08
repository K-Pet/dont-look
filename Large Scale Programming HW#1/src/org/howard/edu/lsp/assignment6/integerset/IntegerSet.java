package org.howard.edu.lsp.assignment6.integerset;
import java.util.ArrayList;
import java.util.Collections;
import org.howard.edu.lsp.assignment6.integerset.IntegerSet;

// @author Kobe


public class IntegerSet  {
	// Hint: probably best to use an array list.  You will need to do a little research
	ArrayList<Integer> set = new ArrayList<Integer>();
	public ArrayList<Integer> getSet(){
		return this.set;
	};
	/**
	 *  Clears the internal representation of the set
	 */
	public void clear() {
		set.removeAll(set);
	};
	
	/**
	 *  Returns the length of the set
	 * @return
	 */
	public int length() {
		return set.size();
	};
	
	/*
	 * Returns true if the 2 sets are equal, false otherwise;
	 * Two sets are equal if they contain all of the same values in ANY order.
	 */
	public boolean equals(IntegerSet b) {
		ArrayList<Integer> listb = b.set;
		
		if(set.size() != listb.size()) {
			return false;
		}
		
		ArrayList<Integer> temp = set;
		
		ArrayList<Integer> temp2 = listb;
		
		Collections.sort(temp);
		Collections.sort(temp2);
		
		for(int i = 0; i<temp.size(); i++) {
			if(temp.get(i) != temp2.get(i)) {
				return false;
			}
		}
		return true;
	}; 
	
	/**
	 *  Returns true if the set contains the value, otherwise false
	 * @param value
	 * @return
	 */
	public boolean contains(int value) {
		if(set.contains(value)) {
			return true;
		}
		return false;
	};    
	
	/**
	 *  Returns the largest item in the set; Throws a IntegerSetException if the set is empty 
	 * @return
	 * @throws IntegerSetException
	 */
	public int largest() throws IntegerSetException {
		if(set.size() == 0) {
			throw new IntegerSetException("Set is empty, cannot continue");
		}
		
		int max = 0;
		
		for(int i=0;i<set.size();i++) {
			if(set.get(i)>max) {
				max = set.get(i);
			}
		}
		
		return max;
	}; 
	
	/**
	 *  Returns the smallest item in the set; Throws a IntegerSetException if the set is empty
	 * @return
	 * @throws IntegerSetException
	 */
	public int smallest() throws IntegerSetException {
		if(set.size() == 0) {
			throw new IntegerSetException("Set is empty, cannot continue");
		}
		
		int min = set.get(0);
		
		for(int i=0;i<set.size();i++) {
			if(set.get(i)<min) {
				min = set.get(i);
			}
			
		}
		
		return min;
	};
		
	
	/**
	 *  Adds an item to the set or does nothing it already there	
	 * @param item
	 */
	public void add(int item) {
		 boolean exist=false;
		 
		 for(int i=0;i<set.size();i++) {
			 if(set.get(i)==item) {
				 exist=true;
			 }
		 }
		 if(exist==false) {
			 set.add(item);
		 }
		 
	};
	
	/**
	 *  Removes an item from the set or does nothing if not there
	 * @param item
	 */
	public void remove(int item) {
		
		for(int i=0;i<set.size();i++) {
			
			if(set.get(i)==item) {
				set.remove(i);
			}
		}
	}; 
	
	/**
	 *  Set union
	 * @param intSetb
	 */
	public void union(IntegerSet intSetb) {
		ArrayList<Integer> listb = intSetb.getSet();
		set.addAll(listb);
	};
	
	/**
	 *  Set intersection
	 * @param intSetb
	 */
	public void intersect(IntegerSet intSetb) {
		ArrayList<Integer> listb = intSetb.getSet();
		set.retainAll(listb);
	}; 
	
	/**
	 *  Set difference, i.e., s1 –s2
	 * @param intSetb
	 */
	public void diff(IntegerSet intSetb) {
		ArrayList<Integer> listb = intSetb.getSet();
		set.removeAll(listb);
	};

	/**
	 *  Returns true if the set is empty, false otherwise
	 * @return
	 */
	public boolean isEmpty() {
		if(set.size() == 0) {
			return true;
		}
		else {
			return false;
		}
	}; 
	
	/**
	 *  Return String representation of your set
	 */
	public String toString() {
		return set.toString();
	};
};