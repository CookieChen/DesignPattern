package FactoryMethod.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import FactoryMethod.Apple;
import FactoryMethod.AppleLover;
import FactoryMethod.Orange;
import FactoryMethod.OrangeLover;

public class FactoryMethodTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testFactoryMethod() {
		AppleLover cookie = new AppleLover();
		OrangeLover eve = new OrangeLover();
		
		String fruitOfCookie = cookie.eatFruit();
		String fruitOfEve = eve.eatFruit();
		
		Assert.assertTrue(fruitOfCookie.equals(Apple.class.toString()));
		Assert.assertTrue(fruitOfEve.equals(Orange.class.toString()));
	}

}
