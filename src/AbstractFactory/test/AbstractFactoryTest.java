package AbstractFactory.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import AbstractFactory.*;

public class AbstractFactoryTest {
	
	AbstractFactory apple;
	AbstractFactory htc;
	
	@Before
	public void setUp() throws Exception {
		apple = new AppleFactory();
		htc = new HTCFactory();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCreateIPhone() {
		AbstractPhone iphone = apple.createPhone();
		
		Assert.assertTrue(iphone.getClass().toString().equals(IPhone.class.toString()));
	}

	@Test
	public void testCreateIPad()
	{
		AbstractPad ipad = apple.createPad();
		
		Assert.assertTrue(ipad.getClass().toString().equals(IPad.class.toString()));
	}
	
	@Test
	public void testCreateNewOne()
	{
		AbstractPhone newOne = htc.createPhone();
		
		Assert.assertTrue(newOne.getClass().toString().equals(NewOne.class.toString()));
	}
	
	@Test
	public void testCreateFlyer()
	{
		AbstractPad flyer = htc.createPad();
		
		Assert.assertTrue(flyer.getClass().toString().equals(Flyer.class.toString()));
	}
}
