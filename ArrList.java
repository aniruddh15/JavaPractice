

import java.util.ArrayList;

public class ArrList {
	
	ArrayList<Integer> list = new ArrayList<Integer>();
	
	// No arg constructor
	public ArrList() {
		
	}
	
	// Accessor method to get inputs of the Array List
	public void getArrListInputs() {
		java.util.Scanner scan = new java.util.Scanner(System.in);
		Integer input = scan.nextInt();
		while (input.intValue() != 0) {
			list.add(input);
			input = scan.nextInt();
		}
	}
	
	//returns the maximum value in an ArrayList of integers
	public static Integer max(ArrayList<Integer> list) {
		if (list.size() == 0) {
			return null;
		}
		int max = 0;
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i) > max) {
				max = list.get(i);
			}
		}
		return max;
	}
	
	// Add all of the values in the array list
	public static double sum(ArrayList<Integer> list) {
		double sum = 0;
		for(int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}
		return sum;
	}
	
	// Combine two array lists
	public static ArrayList<Integer> union( ArrayList<Integer> list1, ArrayList<Integer> list2) {
		ArrayList<Integer> unionList = new ArrayList<Integer>();
		for(int i = 0; i < list1.size(); i++) {
			unionList.add(list1.get(i));
		}
		for(int i = 0; i < list2.size(); i++) {
			unionList.add(list2.get(i));
		}
		
		return unionList;
	}

	
}
