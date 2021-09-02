package main_package;

public class Point {

	double x,y;
	
	Point(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	public double lengthBetween(Point p) {
		double x1 = this.x;
		double y1 = this.y;
		double x2 = p.x;
		double y2 = p.y;

		double length = Math.sqrt(Math.pow(x2-x1, 2) +  Math.pow(y2-y1, 2));

		return length;
	}

	public static void compareLine(Double length1, Double length2){
		if(length1.equals(length2)) {
			System.out.println("Both Lines l1 and l2 are equal");
		}
		else {
			int res = length1.compareTo(length2);

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
