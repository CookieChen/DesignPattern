package bridge.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import bridge.Abstraction;
import bridge.IPhone;
import bridge.NewOne;

public class BridgeTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testBridge() {
		//Arrange
		Abstraction iphone = new Abstraction(new IPhone());
		Abstraction newOne = new Abstraction(new NewOne());
		
		//Act
		String iPhoneClass = iphone.call();
		String NewOneClass = newOne.call();

		//Assert
		Assert.assertTrue(IPhone.class.toString().equals(iPhoneClass));
		Assert.assertTrue(NewOne.class.toString().equals(NewOneClass));
	}

}
