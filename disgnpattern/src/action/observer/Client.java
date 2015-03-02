package observer;

import java.util.Random;

public class Client {

	public static void main(String[] args) {
		Observer observer1 = new Observer1();
		Observer observer2 = new Observer2();
		Random random = new Random(System.currentTimeMillis());
		Customer customer = new Customer();
		customer.change(random.nextLong());
		customer.attach(observer1);
		customer.attach(observer2);
		customer.change(random.nextLong());
		customer.notifyObservers();
		customer.detach(observer2);
		customer.change(random.nextLong());
		customer.notifyObservers();
	}
}
