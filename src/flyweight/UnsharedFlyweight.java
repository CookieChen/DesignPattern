package flyweight;

public class UnsharedFlyweight extends Flyweight {

	@Override
	public boolean operation(State state) {
		return true;
	}

}
