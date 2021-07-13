package introtocs;

public class Player {
 private int value1, value2;
 private String name;
 
	public Player(String player) {
		name = player;
		rollDice();
	}


	public void rollDice(){
		//creates 2 dice and rolls them
		Die die1 = new Die(6);
		Die die2 = new Die(6);
		
		//get value of rolls
		value1 = die1.getVal();
		value2 = die2.getVal();
	}
	public String getName(){
		return name;
	}
	public int getVal1(){
		return value1;
	}
	public int getval2(){
		return value2;
	}
}
