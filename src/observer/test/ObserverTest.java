package observer.test;

import static org.junit.Assert.*;
import observer.Observer;
import observer.Subject;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ObserverTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testObserver() {
		Observer observer = new Observer();
		Subject subject = new Subject();
		
		subject.setState(Subject.INIT_STATE);
		subject.attach(observer);
		subject.notifyObserver();
		String exceptedEquals = subject.getState();
		
		subject.detach(observer);
		subject.setState(Subject.PROCESS_STATE);
		subject.notifyObserver();
		String exceptedNotEquals = subject.getState();
		
		assertEquals(exceptedEquals, observer.getState());
		assertNotEquals(exceptedNotEquals, observer.getState());
	}

}
