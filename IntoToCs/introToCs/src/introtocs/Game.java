package introtocs;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		int numPlayers;
		String playerName;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("how many players?");
		numPlayers = keyboard.nextInt();
		
		for(int i = 1; i <= numPlayers; i++){
			System.out.println("Enter player" + i + "name: ");
			playerName = keyboard.next();
			Player playerName = new Player(player);
		}

	}

}
