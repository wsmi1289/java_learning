package introtocs.creditcard;

public class SoftwareDiscount {
private double number_package;
double discount;
	public SoftwareDiscount(double numP) {
		// TODO Auto-generated constructor stub
		number_package = numP;
	}
	public double getDiscount(){
		if(number_package >= 10 && number_package <= 19 ){
			discount = 0.2;
		}
		else if (number_package >= 20 && number_package <= 49){
			discount = 0.3;
		}
		else if(number_package >= 50 && number_package <= 99){
			discount = 0.4;
		}
		else{
			discount = 0.5;
		}
		return discount;
	}
}
