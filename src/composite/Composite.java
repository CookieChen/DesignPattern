package composite;

import java.util.*;

public class Composite extends Component {

	private Collection<Component> collect;
	
	public Composite()
	{
		collect = new ArrayList<Component>();
	}
	
	public void add(Component compnt) {
		collect.add(compnt);
	}
	
	public void remove(Component compnt) {
		collect.remove(compnt);
	}

	public int size() {
		return collect.size();
	}

	@Override
	public boolean stubOperation() {
		
		boolean result = true;
		for(Component compnt:collect)
		{
			if(compnt.stubOperation() == false)
				result = false;
		}
		return result;
	}
}
