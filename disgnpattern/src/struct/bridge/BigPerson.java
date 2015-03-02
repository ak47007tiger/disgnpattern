package bridge;

public class BigPerson extends Person {

	@Override
	public void read() {
		System.out.println("大人在读书");
		book.showContent();
		book.position.showLoaction();
	}

}
