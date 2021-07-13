import introtocs.freezeBoil;

import java.util.Scanner;

public class freezeBoilDemo {

	public static void main(String[] args) {
		double temperature;
		Boolean eFreeze, oFreeze, wFreeze, eBoil, oBoil, wBoil;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("enter a temperature");
		temperature = keyboard.nextDouble();
		
		freezeBoil check = new freezeBoil(temperature);
		
		eFreeze = check.isEthylFreezing();
		oFreeze = check.isOxygenFreezing();
		wFreeze = check.isWaterFreezing();
		eBoil = check.isEthylBoiling();
		oBoil = check.isOxygenBoiling();
		wBoil = check.isWaterBoiling();
		
		System.out.print("Freezing: ");
			
		if(eFreeze == true){
			System.out.print("Ethyl ");
		} else { System.out.print("");}
		
		if (oFreeze == true){
			System.out.print("Oxygen ");
		} else { System.out.print("");}
		
		if(wFreeze == true){
			System.out.print("water");
		} else { System.out.print("");}

		System.out.println("");
		System.out.print("Boiling: ");
	
		if(eBoil == true){
			System.out.print("Ethyl ");
		} else { System.out.print("");}
		
		if (oBoil == true){
			System.out.print("Oxygen ");
		} else { System.out.print("");}
		
		if(wBoil == true){
			System.out.print("water");
		} else { System.out.print("");}

	}

}
