package java;

import java.util.Scanner;

public class TemperatureDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter any Temperature:");

		Temperature temperature = new Temperature(keyboard.nextDouble());

	}

}
