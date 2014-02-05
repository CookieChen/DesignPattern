package changeOfResponsibility.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import changeOfResponsibility.Application;
import changeOfResponsibility.Button;
import changeOfResponsibility.HelpHandler;
import changeOfResponsibility.Widget;

public class ChangeOfResponsibilityTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testHelper() {
		//Arrange
		Application app = new Application(null);
		Widget widget = new Widget(app);
		Button button = new Button(widget);

		//Act
		HelpHandler handlerOfApp = app.getHelpHandler();
		HelpHandler handlerOfWidget = widget.getHelpHandler();
		HelpHandler handlerOfButton = button.getHelpHandler();
		
		//Assert
		Assert.assertNull(handlerOfApp);
		Assert.assertEquals(Application.class, handlerOfWidget.getClass());
		Assert.assertEquals(Widget.class, handlerOfButton.getClass());
	}

}
