package adapter;

public class DynamicAdapter extends Target{
	private StaticAdaptee mAdaptee;
	
	public DynamicAdapter(StaticAdaptee adaptee)
	{
		mAdaptee = adaptee;
	}
	
	@Override
	public boolean doRequest() {
		return mAdaptee.doRequestImp();
	}
	
}
