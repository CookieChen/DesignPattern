package interpreter;

import composite.Component;

public abstract class AbstractExpression extends Component {
	
	public abstract void interpreter(Context context);
}
