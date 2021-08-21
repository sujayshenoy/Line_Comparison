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
}
