package decorator.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import composite.Leaf;
import decorator.Decorator;

public class DecoratorTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testDecorator() {
		Decorator rootComposit = new Decorator();
		Decorator childComposite = new Decorator();
		Leaf rootLeaf = new Leaf(){
			@Override
			public boolean stubOperation() {
				return false;
			}
		};
		Leaf childLeaf = new Leaf();
		
		childComposite.add(childLeaf);
		rootComposit.add(childComposite);
		rootComposit.add(rootLeaf);
		
		Assert.assertFalse(rootComposit.stubOperation());
		Assert.assertTrue(childComposite.stubOperation());
	}

}
