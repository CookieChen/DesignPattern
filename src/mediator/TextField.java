package mediator;

public class TextField extends Widget {
	
	private String wordStyle;

	public void setText(String wordStyle) {
		this.wordStyle = wordStyle;
	}
	
	public String getText(){
		return wordStyle;
	}
}
