package AbstractFactory;

public class HTCFactory extends AbstractFactory {

	@Override
	public AbstractPhone createPhone() {
		return new NewOne();
	}

	@Override
	public AbstractPad createPad() {
		return new Flyer();
	}

}
