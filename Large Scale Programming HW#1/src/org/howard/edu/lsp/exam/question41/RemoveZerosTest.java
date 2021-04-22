/**
 * 
 */
package org.howard.edu.lsp.exam.question41;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import org.howard.edu.lsp.exam.question41.RemoveZeros;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author Kobe
 *
 */
class RemoveZerosTest {
	private final PrintStream standardOut = System.out;
	private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
	
	@BeforeEach
	public void setUp() {
	    System.setOut(new PrintStream(outputStreamCaptor));
	}
	
	@AfterEach
	public void tearDown() {
		System.setOut(standardOut);
	}

	@Test
	@DisplayName("Test") 
	void test() {
		ArrayList<Integer> test_array = new ArrayList<Integer>();
		test_array.add(0);
		test_array.add(2);
		test_array.add(5);
		test_array.add(0);
		test_array.add(9);
		test_array.add(0);
		RemoveZeros.removeZeros(test_array);
		assertEquals("[2, 5, 9]", outputStreamCaptor.toString().trim());
		
	}

}
