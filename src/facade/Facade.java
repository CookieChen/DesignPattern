package facade;

public class Facade implements IParser, IScanner {

	@Override
	public String scan() {
		return Scanner.class.toString();
	}

	@Override
	public String parse() {
		return Parser.class.toString();
	}

}
