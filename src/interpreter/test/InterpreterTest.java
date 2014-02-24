package interpreter.test;

import interpreter.Context;
import interpreter.NonterminalExpression;
import interpreter.TerminalExpression;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class InterpreterTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testInterpreter() {
		//Arrange
		Context stubTrueContext = new Context(){
			@Override
			public boolean stubOperation(){
				return true;
			}
		};
		
		Context stubFalseContext = new Context();
		
		TerminalExpression terminalExpress = new TerminalExpression();
		NonterminalExpression nonterminalExpress = new NonterminalExpression();
		
		
		//Act
		terminalExpress.interpreter(stubTrueContext);
		nonterminalExpress.interpreter(stubFalseContext);
		
		boolean trueResult = terminalExpress.stubOperation();
		boolean falseResult = nonterminalExpress.stubOperation();
		
		//Assert
		Assert.assertTrue(trueResult);
		Assert.assertFalse(falseResult);
	}

}
