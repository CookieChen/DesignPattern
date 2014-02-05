package facade.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import facade.Facade;
import facade.Parser;
import facade.Scanner;

public class FacadeTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testFacade() {
		//Arrange
		Facade compiler = new Facade();
		
		//Act
		String nameOfScanner = compiler.scan();
		String nameOfParser = compiler.parse();
		
		//Assert
		Assert.assertTrue(nameOfScanner.equals(Scanner.class.toString()));
		Assert.assertTrue(nameOfParser.equals(Parser.class.toString()));
	}

}
