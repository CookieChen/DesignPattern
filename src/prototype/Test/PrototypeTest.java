package prototype.Test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import prototype.Apple;
import prototype.Client;
import prototype.Orange;


public class PrototypeTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testPrototype() {
		Client man = new Client();
		Apple apple = new Apple();
		Orange orange = new Orange();
		
		Apple eatedApple = (Apple) man.eatFruit(apple);
		Orange eatedOrange = (Orange) man.eatFruit(orange);
		
		Assert.assertNotEquals(eatedApple, apple);
		Assert.assertTrue(eatedApple.getClass().toString().equals(apple.getClass().toString()));
		Assert.assertNotEquals(eatedOrange, orange);
		Assert.assertTrue(eatedOrange.getClass().toString().equals(orange.getClass().toString()));
	}

}
