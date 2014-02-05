package changeOfResponsibility;

public abstract class HelpHandler {
	HelpHandler helpHandler;

	HelpHandler(HelpHandler helper) {
		setHandler(helper);
	}

	void setHandler(HelpHandler helper) {
		helpHandler = helper;
	}

	void handleHelp() {
		if (helpHandler != null)
			helpHandler.handleHelp();
	}
	
	public HelpHandler getHelpHandler()
	{
		return helpHandler;
	}
}
