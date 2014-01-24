package FactoryMethod;

public class OrangeLover extends Creator {

	@Override
	protected Product createFruit() {
		return new Orange();
	}

	@Override
	public String eatFruit() {
		Product orange = createFruit();
		return orange.getClass().toString();
	}
}
