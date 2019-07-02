

public class TestGeometricObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle(2.5);
		Circle c2 = new Circle(4.4);
		
		Rectangle r1 = new Rectangle(3.2, 6.5);
		Rectangle r2 = new Rectangle(1.4, 13.2);
		
		System.out.println("Circle 1 has radius " + c1.getRadius());
		System.out.println("Circle 2 has radius " + c2.getRadius());
		if(c1.max(c1, c2) == c1)
			System.out.println("The greater circle is Circle 1");
		else
			System.out.println("The greater circle is Circle 2");
		
		System.out.println();
		
		System.out.println("Rectangle 1 has width " + r1.getWidth() + " and height " + r1.getHeight());
		System.out.println("Rectangle 2 has width " + r2.getWidth() + " and height " + r2.getHeight());
		if(r1.max(r1, r2) == r1)
			System.out.println("The greater rectangle is Rectangle 1");
		else
			System.out.println("The greater rectangle is Rectangle 2");
	}

}
