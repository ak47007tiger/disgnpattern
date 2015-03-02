package observer;

public class Observer1 extends Observer{

	@Override
	void update(Customer customer) {
		System.out.println("update observer1");
		System.out.println(customer.val);
	}

}
