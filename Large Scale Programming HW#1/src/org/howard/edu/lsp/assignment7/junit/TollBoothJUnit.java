/**
 * 
 */
package org.howard.edu.lsp.assignment7.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.howard.edu.lsp.assignment7.tollbooth.TollBooth;
import org.howard.edu.lsp.assignment7.tollbooth.Truck;
import org.howard.edu.lsp.assignment7.tollbooth.FordTruck;
import org.howard.edu.lsp.assignment7.tollbooth.CyberTruck;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author Kobe
 *
 */
class TollBoothJUnit {

	@Test
	@DisplayName("Test Calculate Toll")
	void testCalculateToll() {
		TollBooth tollbooth = new TollBooth();
		FordTruck Ford = new FordTruck(5, 12000); 
		int value = tollbooth.calculateToll(Ford);
		assertEquals(145,value);
	}
	
	@Test
	@DisplayName("Test for Display Data")
	void testDisplayData() {
		TollBooth tollbooth = new TollBooth();
		Truck Ford = new FordTruck(5, 12000);
		Truck CyberTruck = new CyberTruck(2, 5000);
		tollbooth.calculateToll(Ford);
		tollbooth.calculateToll(CyberTruck);
		int[] value = tollbooth.DisplayData();
		assertEquals(value[0], 2);
		assertEquals(value[1], 205);
	}
	
		@Test
		@DisplayName("Test for Reset")
		void testReset() {
			TollBooth tollbooth = new TollBooth();
			Truck Ford = new FordTruck(5, 12000);
			Truck CyberTruck = new CyberTruck(2, 5000);
			tollbooth.calculateToll(Ford);
			tollbooth.calculateToll(CyberTruck);
			int[] value = tollbooth.reset();
			assertEquals(value[0], 0);
			assertEquals(value[1], 0);
			}

}
