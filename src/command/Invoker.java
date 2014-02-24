package command;

public class Invoker {
	private Command cmd;
	
	public void storeCommand(Command cmd){
		this.cmd = cmd;
	}
	
	public String triggerInvoker(){
		return cmd.execute();
	}
}
