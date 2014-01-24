package FactoryMethod;

public class AppleLover extends Creator {

	@Override
	protected Product createFruit() {
		return new Apple();
	}

	@Override
	public String eatFruit() {
		Product apple = createFruit();
		return apple.getClass().toString();
	}

}
