/**
 * 
 */
package org.howard.edu.lsp.exam.question40;

/**
 * @author Kobe
 *
 */
public class Goose extends Animal implements Flying {
	
	@Override
	public void fly() {
		/**
		 * Displays the goose specific flight statement
		 */
		System.out.println("Goose takes flight, beginning it's fantastical sky traversial journey.");
		}

	@Override
	public void speak() {
		/**
		 * Displays goose speaking statement
		 */
		System.out.println("This Goose speaks");
	}
	
	@Override
	public void move() {
		/**
		 * Displays goose movement statement
		 */
		System.out.println("This Goose moves");
	}
}
