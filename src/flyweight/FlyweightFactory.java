package flyweight;

public class FlyweightFactory {
	static Flyweight sharedFlyweight;
	static Flyweight unsharedFlyweight;
	static Flyweight flyweight;

	public static Flyweight createFlyweight(String state) {
		if (SharedState.class.toString().equals(state)) {
			if (sharedFlyweight == null)
				sharedFlyweight = new SharedFlyweight();
			flyweight = sharedFlyweight;
		} else if (UnsharedState.class.toString().equals(state)) {
			if (unsharedFlyweight == null)
				unsharedFlyweight = new UnsharedFlyweight();
			flyweight = unsharedFlyweight;
		}

		return flyweight;
	}
}
