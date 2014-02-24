package iterator;

import java.util.ArrayList;

public class ConcreteIterator implements Iterator {
	protected ArrayList<String> list;
	private int indexer;

	public ConcreteIterator() {
		list = new ArrayList<String>();
		indexer = 0;
		setup();
	}

	protected void setup() {

	}

	@Override
	public void first() {
		indexer = 0;
	}

	@Override
	public void next() {
		indexer++;
	}

	@Override
	public boolean isDone() {
		if (indexer + 1 == list.size())
			return true;
		return false;
	}

	@Override
	public String currentItem() {
		return list.get(indexer);
	}

}
