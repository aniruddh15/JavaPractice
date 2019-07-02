

import java.util.Scanner;

public class TestTriangle {

	public static void main(String[] args) {
		// Create and initialize Scanner object
		Scanner scan = new Scanner(System.in);
		
		// Create and initialize Triangle object
		Triangle tri1 = new Triangle();
		
		// User input of data field values
		System.out.print("Enter the length of side 1: ");
		double s1 = scan.nextDouble();
		tri1.setSide1(s1);
		System.out.print("Enter the length of side 2: ");
		double s2 = scan.nextDouble();
		tri1.setSide2(s2);
		System.out.print("Enter the length of side 3: ");
		double s3 = scan.nextDouble();
		tri1.setSide3(s3);
		
		System.out.println();
		
		System.out.print("Enter the color of the triangle: ");
		String color = scan.next();
		tri1.setColor(color);
		
		System.out.print("Is the triangle filled? (Enter Y/N): ");
		char whetherFilled = scan.next().charAt(0);
		if(whetherFilled == 'Y' || whetherFilled == 'y') {
			tri1.setFilled(true);
		}
		else {
			tri1.setFilled(false);
		}
		
		// Print out the calculated results
		System.out.println("\nThe area of the triangle is: " + tri1.getArea());
		System.out.println("The perimeter of the triangle is: " + tri1.getPerimeter());
		System.out.println("The triangle's color is: " + tri1.getColor());
		if(tri1.isFilled() == true) {
			System.out.println("The triangle is filled");
		}
		else {
			System.out.println("The triangle is not filled");
		}
		
	}

}
