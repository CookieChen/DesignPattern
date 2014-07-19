package state;

public class TCPEstablished implements TCPState {

	@Override
	public TCPState open() {
		return this;
	}

}
