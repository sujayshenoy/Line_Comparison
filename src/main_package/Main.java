package main_package;

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation Program");
		
		//Line 1
		Point p1 = new Point(10,10);
		Point p2 = new Point(30,30);
		
		//Line 2
		Point p3 = new Point(30,30);
		Point p4 = new Point(50,70);
		
		Double l1_length = new Double(p1.lengthBetween(p2));
		Double l2_length = new Double(p3.lengthBetween(p4));
		
		System.out.println("Length of line l1 is: "+String.format("%.2f",l1_length));
		System.out.println("Length of line l1 is: "+String.format("%.2f",l2_length));
		

		if(l1_length.equals(l2_length)) {
			System.out.println("Both Lines l1 and l2 are equal");
		}
		else {
			int res = l1_length.compareTo(l2_length);

			switch (res) {
			case 1:
				System.out.println("Line l1 is longer than line l2");
				break;
			case -1:
				System.out.println("Line l2 is longer than line l1");
				break;
			}
		}
	}

}
