package AbstractFactory;

public class AppleFactory extends AbstractFactory {

	@Override
	public AbstractPhone createPhone() {
		return new IPhone();
	}

	@Override
	public AbstractPad createPad() {
		return new IPad();
	}

}
