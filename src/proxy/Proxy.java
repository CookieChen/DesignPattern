package proxy;

public class Proxy implements ISubject {
	
	private RealSubject realSubject;
	
	public RealSubject getRealSubject() {
		return realSubject;
	}

	public Proxy()
	{
		
	}
	
	public Proxy(RealSubject realSubj)
	{
		realSubject = realSubj;
	}
	
	@Override
	public void request() {
		realSubject.request();
	}

	@Override
	public void lazyCreation() {
		if(realSubject == null)
		{
			realSubject = new RealSubject();
		}
	}
}
