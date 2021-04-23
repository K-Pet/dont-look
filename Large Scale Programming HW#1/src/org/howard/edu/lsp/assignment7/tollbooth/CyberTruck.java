/**
 * 
 */
package org.howard.edu.lsp.assignment7.tollbooth;

/**
 * @author Kobe
 *
 */
public class CyberTruck extends TollBooth implements Truck {
	/**
	 * Creates Cybertruck
	 * @param axles
	 * @param Weight
	 */
	public CyberTruck(int axles, int Weight)
	   {
	this.axles = axles;
	this.Weight = Weight;
	}
	/**
	 * Gets axles
	 */
	public int getAxles()
	   {
	       return axles;
	   }
	/**
	 * Gets weight
	 */
	public int getWeight()
	   {
	       return Weight;
	   }
	int axles;
	int Weight;
	}
