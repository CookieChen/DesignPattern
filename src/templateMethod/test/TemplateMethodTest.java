package templateMethod.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import templateMethod.AbstractTemplate;
import templateMethod.ConcreteTemplate;
import templateMethod.ConcreteTemplate2;

public class TemplateMethodTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testTemplateMethod() {
		AbstractTemplate templateObject = new ConcreteTemplate();
		
		String exceptedTemplateOneClass = templateObject.templateMethod();
		
		templateObject = new ConcreteTemplate2();
		String exceptedTemplateTwoClass = templateObject.templateMethod();
		
		assertEquals(exceptedTemplateOneClass, ConcreteTemplate.class.toString());
		assertEquals(exceptedTemplateTwoClass, ConcreteTemplate2.class.toString());
	}

}
