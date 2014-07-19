package memento;

public class Originator {
	Memento mMemento;
	public Originator(Memento memento) {
		setMemento(memento);
	}
	public void setMemento(Memento memento) {
		mMemento = memento;
	}
	public Memento getMemento() {
		return mMemento;
	}

}
