package bridge;

public class OldPerson extends Person {

	@Override
	public void read() {
		System.out.println("老人读书中");
		book.showContent();
		book.position.showLoaction();
	}

}
