package observer;

public class Observer {
	private String mState;
	public String getState() {
		return mState;
	}
	public void update(String state) {
		mState = state;
	}

}
