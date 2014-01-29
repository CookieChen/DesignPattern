package singleton.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import singleton.DeviceManager;
import singleton.Singleton;

public class SingletonTest {
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testSingleton()
	{
		//Arrange
		DeviceManager devManager = Singleton.createDeviceManager();

		//Assert
		Assert.assertEquals(devManager, Singleton.createDeviceManager());
	}
}
