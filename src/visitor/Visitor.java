package visitor;

public class Visitor implements IVisitor{

	@Override
	public boolean visitElementA(ElementA elmntA) {
		return elmntA.stubOperation();
	}

	@Override
	public boolean visitElementB(ElementB elmntB) {
		return elmntB.stubOperation();
	}

}
