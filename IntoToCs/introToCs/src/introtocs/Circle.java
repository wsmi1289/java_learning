package introtocs;

public class Circle {
	private double radius;
	final double pi = 3.14159;
	public Circle(double rad) {
		radius = rad;
	}
	public Circle(){
		radius = 0.0;
	}
	public void setRadius(double rad){
		radius = rad;
	}
	public double getArea(){
		double area;
		area = pi * (radius * radius);
		return area;
	}
	public double getDiameter(){
		double diameter;
		diameter = radius * 2;
		return diameter;
	}
	public double getCirc(){
		double circ;
		circ = 2* (pi)*radius;
		return circ;
	}
}
