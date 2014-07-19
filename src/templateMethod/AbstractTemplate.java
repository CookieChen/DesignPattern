package templateMethod;

public abstract class AbstractTemplate {

	public String templateMethod() {
		return operation();
	}
	
	protected abstract String operation();

}
