package interpreter;

public class NonterminalExpression extends AbstractExpression{
	private Context mContext;
	@Override
	public void interpreter(Context context) {
		mContext = context;
	}

	@Override
	public boolean stubOperation() {
		return mContext.stubOperation();
	}

}
