package introtocs;

import java.util.Random;


public class Die {
	private int value;
	final int sides = 6;
	
	public Die(int numsides) {
		numsides=sides;
		roll();
	}
	/**
	 * Rolls die with sides 0-5 and adds one to answer to get 0-6
	 */
	public void roll(){
		Random rand = new Random();
		value = rand.nextInt(sides) + 1;
	}
	
	public int getSides(){
		return sides;
	}
	public int getVal(){
		return value;
	}
	
}
