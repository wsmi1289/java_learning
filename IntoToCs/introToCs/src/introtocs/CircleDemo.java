package introtocs;
import java.util.Scanner;

public class CircleDemo {

	public static void main(String[] args) {
		double radius, area, diameter, circumference;
		
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the radius of your circle:");
		radius = keyboard.nextDouble();
		
		Circle round = new Circle(radius);
		
		area = round.getArea();
		diameter = round.getDiameter();
		circumference = round.getCirc();
		
		System.out.println("area = " + area + " diameter = " + diameter + " circumference = " + circumference);
		
	}

}
