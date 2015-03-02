package bridge;

public class SmallPerson extends Person {

	@Override
	public void read() {
		System.out.println("小孩读书中");
		book.showContent();
		System.out.println("小孩不注意书是哪来的");
	}

}
