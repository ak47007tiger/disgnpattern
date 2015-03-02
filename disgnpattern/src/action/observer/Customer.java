package observer;

import java.util.ArrayList;
import java.util.List;

public class Customer implements ISubject{

	List<Observer> observers = new ArrayList<Observer>();
	@Override
	public void notifyObservers() {
		System.out.println("notifyObservers");
		for(Observer observer : observers){
			observer.update(this);
		}
	}
	long val;
	public void change(long nextLong) {
		val = nextLong;
	}
	public void attach(Observer observer) {
		observers.add(observer);
	}
	public void detach(Observer observer) {
		observers.remove(observer);
	}

}
