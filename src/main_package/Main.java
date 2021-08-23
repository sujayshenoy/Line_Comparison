package main_package;

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation Program");
		
		//Line 1
		Point p1 = new Point(10,10);
		Point p2 = new Point(30,30);
		
		//Line 2
		Point p3 = new Point(30,30);
		Point p4 = new Point(40,70);
		
		double l1_length = p1.lengthBetween(p2);
		double l2_length = p3.lengthBetween(p4);
		
		System.out.println("Length of line l1 is: "+String.format("%.2f",l1_length));
		System.out.println("Length of line l1 is: "+String.format("%.2f",l2_length));
		
		if(l1_length == l2_length) {
			System.out.println("Two Lines l1 and l2 are equal");
		}
		else if(l1_length > l2_length) {
			System.out.println("Line l1 is longer than line l2");
		}
		else {
			System.out.println("Line l2 is longer than line l1");
		}
	}

}
