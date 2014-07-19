package templateMethod;

public class ConcreteTemplate2 extends AbstractTemplate {

	@Override
	protected String operation() {
		return ConcreteTemplate2.class.toString();
	}

}
