package command;

public class ConcreteCommand extends Command {
	private Receiver recvr;
	
	public ConcreteCommand(Receiver receiver){
		recvr = receiver;
	}
	
	@Override
	public String execute() {
		return recvr.action();
	}

}
