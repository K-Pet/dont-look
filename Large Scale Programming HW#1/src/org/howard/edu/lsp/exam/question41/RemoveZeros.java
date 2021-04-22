/**
 * 
 */
package org.howard.edu.lsp.exam.question41;
import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Kobe
 *
 */
public class RemoveZeros {
	/**
	 * removes all instances of 0 in input list
	 * @param list
	 */
	public static void removeZeros(ArrayList<Integer> list) {
		list.removeAll(Collections.singleton(0));
		System.out.println(list.toString());
	}
}
