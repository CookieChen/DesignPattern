package adapter;

public class DynamicAdaptee implements StaticAdaptee{

	@Override
	public boolean doRequestImp() {
		return true;
	}
}
