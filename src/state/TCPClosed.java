package state;

public class TCPClosed implements TCPState {

	@Override
	public TCPState open() {
		return this;
	}

}
