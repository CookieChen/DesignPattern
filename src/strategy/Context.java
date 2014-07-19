package strategy;

public class Context {
	private Strategy mStrategy;
	
	public void setStrategy(String strategy) {
		if(strategy.equals("A"))
			mStrategy = new StrategyA();
		else if(strategy.equals("B"))
			mStrategy = new StrategyB();
		else if(strategy.equals("C"))
			mStrategy = new StrategyC();
	}

	public Strategy doStrategy() {
		mStrategy.stubOperation();
		return mStrategy;
	}
}
