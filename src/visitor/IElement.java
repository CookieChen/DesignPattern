package visitor;

public interface IElement {
	boolean stubOperation();
	public boolean accept(IVisitor vistor);
}
