package visitor.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import visitor.ElementA;
import visitor.ElementB;
import visitor.Visitor;

public class VisitorTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testStubOperation() {
		ElementA elmntA= new ElementA();
		ElementB elmntB = new ElementB();
		Visitor vistor = new Visitor();
		
		Assert.assertTrue(elmntA.accept(vistor));
		Assert.assertFalse(elmntB.accept(vistor));
	}

}
