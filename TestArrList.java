
import java.util.ArrayList;
import java.util.Scanner;

public class TestArrList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrList a1 = new ArrList();
		
		System.out.println("Enter numbers (end with 0): ");
		a1.getArrListInputs();
		
		System.out.println("The largest Integer in the Array List is: " + a1.max(a1.list));
		System.out.println("The sum of all of the values in the Array List is: " + a1.sum(a1.list));
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter five integers for another array list: ");
		for (int i = 0; i < 5; i++) {
			list2.add(scan.nextInt());
		}

		ArrayList<Integer> combinedList = a1.union(a1.list, list2);
		System.out.println("The two array lists combined are: ");
		for(int i = 0; i < combinedList.size(); i++) {
			System.out.print(combinedList.get(i) + " ");
		}
	}

}
