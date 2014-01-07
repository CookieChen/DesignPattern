package composite.test;

import org.junit.*;

import composite.*;

public class CompositeTest{

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAddComponent() {
		Composite compsit = new Composite();
		Leaf leaf = new Leaf();
		
		compsit.add(leaf);
		
		Assert.assertTrue(compsit.size() == 1);
	}
	
	@Test
	public void testRemoveComponent()
	{
		Composite compsit = new Composite();
		Leaf leaf = new Leaf();
		
		compsit.add(leaf);
		compsit.remove(leaf);
		
		Assert.assertTrue(compsit.size() == 0);
	}
	
	@Test
	public void testStubOperation()
	{
		Composite rootComposit = new Composite();
		Composite childComposite = new Composite();
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
