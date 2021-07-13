package introtocs.creditcard;
import java.util.Scanner;

public class DemoSoftwareDiscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double number, price, discount, finalP;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("how many packages?");
		number = keyboard.nextDouble();
		price = number*99;
		
		SoftwareDiscount check = new SoftwareDiscount(number);
		discount = check.getDiscount();
		finalP = price - (price * discount);
		System.out.println("discount = " + check.getDiscount());
		System.out.println("final price = " + finalP );
	}

}
