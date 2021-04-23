/**
 * 
 */
package org.howard.edu.lsp.assignment7.tollbooth;

/**
 * @author Kobe
 *
 */
public class FordTruck extends TollBooth implements Truck {
	public FordTruck(int axles, int Weight)
	   {
	this.axles = axles;
	this.Weight = Weight;
	}
	
	public int getAxles()
	   {
	       return axles;
	   }
	
	public int getWeight()
	   {
	       return Weight;
	   }
	int axles;
	int Weight;
	}
