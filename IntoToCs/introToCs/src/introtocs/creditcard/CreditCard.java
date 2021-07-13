package introtocs.creditcard;

public class CreditCard {
	private int creditLimit;
	private int balance;
	private String cardholder;
	
	
	/**
	 * 
	 * 
	 * Constructs a credit card with 500 credit limit and the cardholder name
	 *
	 *
	 */
	public CreditCard(String name) {
		// TODO Auto-generated constructor stub
		cardholder = name;
		creditLimit = 500;
		balance = 0;
	}
	
	/**
	 * 
	 * 
	 * Constructs credit card with name and credit limit
	 * 
	 * @param name cardholders name
	 * @param amount of credit limit
	 */
	public CreditCard(String name, int amount){
		creditLimit = amount;
		balance = 0;
		cardholder = name;
	}
	
	
	/**
	 * gets card limit
	 * 
	 * @return the credit limt
	 */
	public int getCreditLimit(){
		return creditLimit;
	}
	
	/**
	 * gets creditcard balance
	 * @return the balance
	 */
	public int getBalance(){
		return balance;
	}
	
	/**
	 * gets the cardholder
	 * @return the card holder
	 */
	public String getCardholder(){
		return cardholder;
	}
	
	/**
	 * Adds the cost of purchase to balance
	 * 
	 * @param amount of purchase
	 */
	public void makePurchase(int amount){
		balance =+ amount;
	}
	public void makePayment(int amount){
		balance =- amount;
	}
	
}
