package bridge;

public class IPhone extends Implementor {

	@Override
	public String doCall() {
		return this.getClass().toString();
	}

}
