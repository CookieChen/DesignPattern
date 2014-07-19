package templateMethod;

public class ConcreteTemplate extends AbstractTemplate {

	@Override
	protected String operation() {
		return ConcreteTemplate.class.toString();
	}

}
