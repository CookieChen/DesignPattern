package mediator;

public class FontDialogDirector extends Mediator {
	
	private ListBox mListBox;
	private static TextField mTextField;
	
	public static void WidgetChanged(String wordStyle){
		mTextField.setText(wordStyle);
	}

	@Override
	public void showDialog() {
		mListBox = new ListBox();
		mTextField = new TextField();
	}

	@Override
	public ListBox getListBox() {
		return mListBox;
	}

	@Override
	public TextField getTextField() {
		return mTextField;
	}
}
