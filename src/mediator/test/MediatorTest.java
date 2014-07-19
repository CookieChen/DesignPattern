package mediator.test;

import static org.junit.Assert.*;
import mediator.FontDialogDirector;
import mediator.ListBox;
import mediator.Mediator;
import mediator.TextField;
import mediator.Widget;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MediatorTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testMediator() {
		Mediator dialogDirector = new FontDialogDirector();
		dialogDirector.showDialog();
		ListBox listBox = dialogDirector.getListBox();
		TextField textField = dialogDirector.getTextField();
		
		listBox.changeToBold();
		String checkedBold = textField.getText();
		
		listBox.changeToItalics();
		String checkedItalics = textField.getText();
		
		assertEquals("Bold", checkedBold);
		assertEquals("Italics", checkedItalics);
	}

}
