package main_package;

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation Program");
		
		Point p1 = new Point(10,10);
		Point p2 = new Point(20,20);
		
		System.out.println("Length of line from p1 to p2 is: "+String.format("%.2f",p1.lengthBetween(p2)));
	}

}
