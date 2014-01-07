package visitor;

public class ElementA implements IElement{

	@Override
	public boolean accept(IVisitor vistor) {
		return vistor.visitElementA(this);
	}

	@Override
	public boolean stubOperation() {
		return true;
	}

}
