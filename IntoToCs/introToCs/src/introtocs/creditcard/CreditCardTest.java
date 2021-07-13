package introtocs.creditcard;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CreditCardTest {
	
	private CreditCard card1;
	private CreditCard card2;

	@Before
	public void setUp() throws Exception {
		card1 = new CreditCard("will smith");
		card2 = new CreditCard("jon doe", 3000);
	}

	@Test
	public void testCreditCardString() {
		fail("Not yet implemented");
	}

	@Test
	public void testCreditCardStringInt() {
		fail("Not yet implemented");
	}

	@Test
	public void testMakePurchase() {
		fail("Not yet implemented");
	}

	@Test
	public void testMakePayment() {
		fail("Not yet implemented");
	}

}
