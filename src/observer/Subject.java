package observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	
	public static String INIT_STATE = "initState";
	public static String PROCESS_STATE = "processState";
	
	private String mState;
	private List<Observer> mObserverList;
	
	public Subject()
	{
		mObserverList = new ArrayList<Observer>();
	}
	
	public void setState(String state) {
		mState = state;
	}
	
	public String getState()
	{
		return mState;
	}

	public void attach(Observer observer) {
		mObserverList.add(observer);
	}

	public void detach(Observer observer) {
		mObserverList.remove(observer);
	}

	public void notifyObserver() {
		for(Observer observer : mObserverList)
		{
			observer.update(mState);
		}
	}

}
