/**
 * 
 */
package org.howard.edu.lsp.assignment7.tollbooth;

/**
 * @author Kobe
 *
 */


public interface TollBoothInterface {
	   public int[] DisplayData();
	   public int calculateToll(Truck T);
	   public int[] reset();
	}
