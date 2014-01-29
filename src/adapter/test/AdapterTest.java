package adapter.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import adapter.DynamicAdaptee;
import adapter.StaticAdaptee;
import adapter.DynamicAdapter;
import adapter.StaticAdapter;

public class AdapterTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testStaticAdapter() {
		//Arrange
		StaticAdapter adapter = new StaticAdapter();
		
		//Act
		boolean isRequest = adapter.doRequest();
		
		//Assert
		Assert.assertTrue(isRequest);
	}
	
	@Test
	public void testDynamicAdapter(){
		//Arrange
		DynamicAdapter adapter = new DynamicAdapter(new DynamicAdaptee());
		
		//Act
		boolean isRequest = adapter.doRequest();
		
		//Assert
		Assert.assertTrue(isRequest);
		
	}

}
