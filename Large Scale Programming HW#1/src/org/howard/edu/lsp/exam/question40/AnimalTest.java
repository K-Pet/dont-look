package org.howard.edu.lsp.exam.question40;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.io.*;

class AnimalTest {
	/**
	 * reassign the standard output stream to a new PrintStream with a ByteArrayOutputStream.
	 * Then restores after test is complete.
	 */
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

	/**
	 * Tests Goose and Tiger speak()
	 */
	@Test
	@DisplayName("Test for Goose speak()")
	void testSpeakg () {
		
		Animal test_goose = new Goose();
		test_goose.speak();
		assertEquals("This Goose speaks", outputStreamCaptor.toString().trim());
		
	}
	
	@Test
	@DisplayName("Test for Tiger speak()")
	void testSpeakt () {
		
		Animal test_tiger = new Tiger();
		test_tiger.speak();
		assertEquals("This Tiger speaks", outputStreamCaptor.toString().trim());
		
	}
	/**
	 * Tests goose and tiger move()
	 */
	@Test
	@DisplayName("Test for Goose move()")
	void testMoveg () {
		
		Animal test_goose = new Goose();
		test_goose.move();
		assertEquals("This Goose moves", outputStreamCaptor.toString().trim());
		
	}
	
	@Test
	@DisplayName("Test for Tiger move()")
	void testMovet () {
		
		Animal test_tiger = new Tiger();
		test_tiger.move();
		assertEquals("This Tiger moves", outputStreamCaptor.toString().trim());
		
	}
	/**
	 * Tests Goose and Airplane fly()
	 */
	@Test
	@DisplayName("Test for Goose fly()")
	void testFlyg () {
		
		Flying test_goose = new Goose();
		test_goose.fly();
		assertEquals("Goose takes flight, beginning it's fantastical sky traversial journey.", outputStreamCaptor.toString().trim());
		
	}
	
	@Test
	@DisplayName("Test for Airplane fly()")
	void testFlya () {
		
		Flying test_airplane = new Airplane();
		test_airplane.fly();
		assertEquals("Airplane lifts off into the sky, carrying its passengers to their next destination", outputStreamCaptor.toString().trim());
		
	}

}
