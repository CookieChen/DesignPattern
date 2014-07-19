package state;

public class TCPListen implements TCPState {

	@Override
	public TCPState open() {
		return this;
	}

}
