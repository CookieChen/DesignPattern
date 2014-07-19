package state;

public class TCPConnection {
	private TCPState state;

	public TCPConnection() {
		state = new TCPEstablished();
	}

	public TCPState open() {
		return state.open();
	}

	public void transition() {
		if (state instanceof TCPEstablished) {
			state = new TCPListen();
		} else if (state instanceof TCPListen) {
			state = new TCPClosed();
		}
	}
}
