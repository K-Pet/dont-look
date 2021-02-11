package org.howard.edu.lsp.assignment2.combination;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;



public class Implementation {
	public List<List<Integer>> combinationSum(int[] arr_of_ints, int target_sum){
		List<List<Integer>> results = new ArrayList<>();
		
		//makes sure list of numbers exists
		if (arr_of_ints == null || arr_of_ints.length == 0) {
			return results;
		}
		//sorts list of numbers
		Arrays.sort(arr_of_ints);
		//creates list
		List<Integer> combination = new ArrayList<>();
		//creates function to find combinations
		toFindCombinationsTotarget_sum(results, combination, arr_of_ints, target_sum, 0);
		
		return results;
	}
	//defines function
	private void toFindCombinationsTotarget_sum(List<List<Integer>> results, java.util.List<Integer> combination, int[] arr_of_ints, int target_sum, int startIndex) {
		if (target_sum == 0 ) {
			results.add(new ArrayList<>(combination));
			return;
		}
		
		for (int i = startIndex; i < arr_of_ints.length; i++) {
			if (arr_of_ints [i] > target_sum) {
				break;
			}
			
			combination.add(arr_of_ints[i]);
			toFindCombinationsTotarget_sum(results, combination, arr_of_ints, target_sum - arr_of_ints[i], i);
			combination.remove(combination.size()-1);
		}
		
	}
}
