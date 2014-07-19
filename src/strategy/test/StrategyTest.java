package strategy.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import strategy.Context;
import strategy.Strategy;
import strategy.StrategyA;
import strategy.StrategyB;
import strategy.StrategyC;

public class StrategyTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testStrategy() {
		Context context = new Context();
		
		context.setStrategy("A");
		Strategy strategyA = context.doStrategy();

		context.setStrategy("B");
		Strategy strategyB = context.doStrategy();
		
		context.setStrategy("C");
		Strategy strategyC =context.doStrategy();
		
		assertTrue(strategyA instanceof StrategyA);
		assertTrue(strategyB instanceof StrategyB);
		assertTrue(strategyC instanceof StrategyC);
	}
}
