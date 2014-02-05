package flyweight;

public class SharedFlyweight extends Flyweight {

	@Override
	public boolean operation(State state) {
		return false;
	}

}
