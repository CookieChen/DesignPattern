package Builder.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Builder.Builder;
import Builder.Director;
import Builder.StubRobot;

public class BuilderTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testBuilder() {
		Builder builder = new StubRobot();
		Director director = new Director(builder);

		Assert.assertTrue(director.isBuilt());
	}
}
