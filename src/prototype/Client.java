package prototype;

public class Client {
	Prototype fruit;
	public Prototype eatFruit(Prototype prototype)
	{
		fruit = prototype.clone();
		
		return prototype.clone();
	}
}
