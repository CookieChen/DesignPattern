package bridge;

import bridge.Implementor;

public class NewOne extends Implementor {

	@Override
	public String doCall() {
		return this.getClass().toString();
	}

}
