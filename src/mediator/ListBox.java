package mediator;

public class ListBox extends Widget {

	public void changeToBold() {
		FontDialogDirector.WidgetChanged("Bold");
	}

	public void changeToItalics() {
		FontDialogDirector.WidgetChanged("Italics");
	}
}
