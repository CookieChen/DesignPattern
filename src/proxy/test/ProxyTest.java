package proxy.test;

import org.junit.*;

import proxy.*;

public class ProxyTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testRequest() {
		RealSubject realSubject = new RealSubject();
		Proxy proxy = new Proxy(realSubject);
		
		proxy.request();
		
		Assert.assertTrue(realSubject.isRequest());
	}
	
	@Test
	public void testLazyCreation()
	{
		Proxy proxy = new Proxy();
		
		proxy.lazyCreation();
		
		Assert.assertTrue(proxy.getRealSubject().isCreated());
	}

}
