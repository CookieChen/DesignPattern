package visitor;

public class ElementB  implements IElement{

	@Override
	public boolean accept(IVisitor vistor) {
		return vistor.visitElementB(this);
	}

	@Override
	public boolean stubOperation() {
		return false;
	}

}
