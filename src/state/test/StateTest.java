package state.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import state.TCPClosed;
import state.TCPConnection;
import state.TCPEstablished;
import state.TCPListen;
import state.TCPState;

public class StateTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testState() {
		TCPConnection connection = new TCPConnection();
		
		TCPState exceptedEstablishedState = connection.open();
		
		connection.transition();
		TCPState exceptedListenState = connection.open();
		
		connection.transition();
		TCPState exceptedClosedState = connection.open();
		
		assertTrue(exceptedEstablishedState instanceof TCPEstablished );
		assertTrue(exceptedListenState instanceof TCPListen);
		assertTrue(exceptedClosedState instanceof TCPClosed);
		
	}

}
