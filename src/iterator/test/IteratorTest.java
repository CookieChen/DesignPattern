package iterator.test;

import static org.junit.Assert.*;
import iterator.Aggregate;
import iterator.ConcreteAggregate;
import iterator.ConcreteIterator;
import iterator.Iterator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IteratorTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testIterator() {
		//Arrange
		Aggregate fakeAggregate = new ConcreteAggregate(){
			@Override
			public Iterator createIterator(){
				return new ConcreteIterator(){
					@Override
					protected void setup(){
						list.add("0");
						list.add("1");
						list.add("2");
					}
				};
				
			}
		};
		
		Iterator iterator = fakeAggregate.createIterator();
		
		//Act
		String zero = iterator.currentItem();
		
		iterator.next();
		String one = iterator.currentItem();
		
		iterator.first();
		String zero2 = iterator.currentItem();
		
		iterator.next();
		iterator.next();
		boolean resultTrue = iterator.isDone();
	
		//Assert
		Assert.assertEquals(zero, String.valueOf(0));
		Assert.assertEquals(one, String.valueOf(1));
		Assert.assertEquals(zero2, String.valueOf(0));
		Assert.assertEquals(resultTrue, true);
	}

}
