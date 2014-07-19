package memento.test;

import static org.junit.Assert.*;
import memento.Memento;
import memento.Originator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MementoTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testMememto() {
		Memento expectedMementoOne = new Memento("1");
		Memento expectedMementoZero = new Memento("0");
		Originator orginator = new Originator(expectedMementoOne);

		Memento comparedEqualMemento = orginator.getMemento();
		
		orginator.setMemento(expectedMementoZero);
		Memento comparedNotEqualMemento = orginator.getMemento();
		
		assertEquals(expectedMementoOne, comparedEqualMemento);
		assertNotEquals(expectedMementoOne, comparedNotEqualMemento);
	}
}
