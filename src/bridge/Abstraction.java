package bridge;

public class Abstraction {
	Implementor implementor;
	public Abstraction(Implementor imp){
		implementor = imp;
	}

	public String call() {
		return implementor.doCall();
	}
}
