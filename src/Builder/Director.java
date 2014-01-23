package Builder;

public class Director {
	private Builder builder;
	private boolean isBuilt = false;
	
	public boolean isBuilt() {
		return isBuilt;
	}

	public Director(Builder aBuilder)
	{
		builder = aBuilder;
		if(!builder.buildHead())
			return;
		if(!builder.buildBody())
			return;
		if(!builder.buildHands())
			return;
		if(!builder.buildLegs())
			return;
		isBuilt=true;
	}
}
