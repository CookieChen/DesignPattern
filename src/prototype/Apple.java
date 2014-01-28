package prototype;

import java.awt.Color;

public class Apple extends Prototype {
	private Color red;
	
	public Apple(Apple apple) {
		red = apple.red;
	}

	public Apple() {
		red = Color.RED;
	}

	@Override
	public Prototype clone(){
		return new Apple(this);
	}
}
