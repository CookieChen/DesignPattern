package prototype;

import java.awt.Color;

public class Orange extends Prototype {
	private Color color;
	
	public Orange(Orange orange) {
		color = orange.color;
	}

	public Orange() {
		color = Color.ORANGE;
	}

	@Override
	public Prototype clone(){
		return new Orange(this);	
	}
}
