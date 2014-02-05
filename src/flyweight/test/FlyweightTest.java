package flyweight.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import flyweight.Flyweight;
import flyweight.FlyweightFactory;
import flyweight.SharedFlyweight;
import flyweight.SharedState;
import flyweight.UnsharedFlyweight;
import flyweight.UnsharedState;

public class FlyweightTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testFlyweight() {
		//Arrange
		Flyweight sharedFlyweight;
		Flyweight unsharedFlyweight;
		
		//Act
		sharedFlyweight = FlyweightFactory.createFlyweight(SharedState.class.toString());
		unsharedFlyweight = FlyweightFactory.createFlyweight(UnsharedState.class.toString());
		
		//Assert
		Assert.assertEquals(sharedFlyweight.getClass().toString(), SharedFlyweight.class.toString());
		Assert.assertEquals(sharedFlyweight, FlyweightFactory.createFlyweight(SharedState.class.toString()));
		Assert.assertEquals(unsharedFlyweight.getClass().toString(), UnsharedFlyweight.class.toString());
		Assert.assertEquals(unsharedFlyweight, FlyweightFactory.createFlyweight(UnsharedState.class.toString()));
	}

}
