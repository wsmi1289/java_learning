import java.util.Scanner;

public class smithq4 {
	public static void main (String[] args) {
		int priceGuest;
		int numGuest;
		int dinnerCost;
		int cakeSize;
		int cakeType;
		int cakeCost;
		int total;

		priceGuest = getMenuChoice();

		Scanner keyboard = new Scanner (System.in);
		System.out.println("Enter number of guests");
		numGuest = keyboard.nextInt();

		dinnerCost = getDinnerCost(numGuest, priceGuest);
		cakeSize = getCakeSize (numGuest);
		cakeType = getCakeType ();
		cakeCost = getCakeCost (cakeSize, cakeType);
		System.out.println("dinner cost= " + dinnerCost);
		System.out.println("cake cost= " + cakeCost);
		total = dinnerCost + cakeCost;
		System.out.println("total cost= " + total);

	}

	//asks for menu choice and returns price per guest

	public static int getMenuChoice(){
		int menu_choice;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Which menu? 1, 2, or 3");
		menu_choice = keyboard.nextInt();
		if (menu_choice == 1){
			return(20);
		}
		else if (menu_choice == 2) {
			return (25);
		}
		else {
			return (30);
		}
	}

	// Computes price of dinner

	public static int getDinnerCost(int num_guest, int price_guest) {
		int dinner_cost;
		dinner_cost = num_guest * price_guest;
		return (dinner_cost);
	}

	//Gets cake size from number of guests

	public static int getCakeSize (int num_guest) {
		if (num_guest <= 150) {
			return (1);
		}
		else if (num_guest <= 225) {
			return (2);
		}
		else {
			return (3);
		}
	}

	//Asks for type of cake

	public static int getCakeType() {
		int cake_type;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Which Cake? 1, 2, or 3");
		cake_type = keyboard.nextInt();
		return (cake_type);
	}

	//takes cake size and type and returns price of cake

	public static int getCakeCost (int cake_size, int cake_type) {
		if(cake_size == 1) {
			if (cake_type == 1) {
				return(450);
			}
			else if (cake_type == 2) {
			return(500);
			}
			else {
			return(550);
			}
		}

		else if (cake_size == 2) {
			if (cake_type == 1) {
				return(675);
			}
			else if (cake_type == 2) {
				return(750);
			}
			else {
				return(825);
			}
		}

		else {
			if (cake_type == 1) {
				return(850);
			}
			else if (cake_type == 2) {
				return(950);
			}
			else {
				return(1050);
			}
		}
	}
}