package adapter;

public class StaticAdapter extends Target implements StaticAdaptee{
	@Override
	public boolean doRequest(){
		return doRequestImp();
	}

	@Override
	public boolean doRequestImp() {
		return true;
	}
}
