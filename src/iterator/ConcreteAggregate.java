package iterator;

public class ConcreteAggregate extends Aggregate {
	@Override
	public Iterator createIterator() {
		return new ConcreteIterator();
	}

}
