package decorator;

import composite.Composite;

public class Decorator extends Composite {

	public boolean stubOperation() {
		boolean isDecorated = false;

		if (super.stubOperation()) {
			isDecorated = addBehavior();
		}

		return isDecorated;
	}

	private boolean addBehavior() {
		return true;
	}

}
