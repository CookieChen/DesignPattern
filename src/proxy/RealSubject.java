package proxy;

public class RealSubject implements ISubject {
	boolean isRequested = false;
	boolean isCreated =  false;
	
	public boolean isCreated() {
		return isCreated;
	}

	public RealSubject()
	{
		isCreated = true;
	}
	
	public boolean isRequest() {
		return isRequested;
	}

	@Override
	public void request() {
		isRequested = true;
	}

	@Override
	public void lazyCreation() {
		// TODO Auto-generated method stub	
	}
}
