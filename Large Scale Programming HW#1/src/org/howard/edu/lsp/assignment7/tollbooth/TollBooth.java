/**
 * 
 */
package org.howard.edu.lsp.assignment7.tollbooth;

/**
 * @author Kobe
 *
 */
public class TollBooth implements TollBoothInterface {
	public int amountoftrucks;
	public int receipts;
	
	/**
	 * Calculates Toll
	 */
	public int calculateToll(Truck T) {
		int axles = T.getAxles();
		int Weight = T.getWeight();
		int tollDue = 5*axles + ((Weight/1000)*10);
		amountoftrucks = amountoftrucks + 1;
		receipts = receipts + tollDue;
		System.out.println(tollDue);
		return tollDue;
	}
	
	/**
	 * Displays data on console
	 */
	public int[] DisplayData() {
		System.out.println("Trucks: " + amountoftrucks);
		System.out.println("Receipts: " + receipts);
		int[] intArray = new int[2];
		intArray [0] = amountoftrucks;
		intArray [1] = receipts;
		return intArray;
	}
	
	/**
	 * Resets Data
	 */
	public int[] reset() {
		this.DisplayData();
		amountoftrucks = 0;
		receipts = 0;
		int[] intArray = new int[2];
		intArray [0] = amountoftrucks;
		intArray [1] = receipts;
		return intArray;
	}

}
