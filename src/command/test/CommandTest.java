package command.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import command.Command;
import command.ConcreteCommand;
import command.Invoker;
import command.Receiver;

public class CommandTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCommand() {
		//Arrange
		Invoker invoker = new Invoker();
		Command cmd = new ConcreteCommand(new Receiver());
		invoker.storeCommand(cmd);
		
		//Act
		String result = invoker.triggerInvoker();
		
		//Assert
		Assert.assertEquals(Receiver.class.toString(), result);
	}

}
