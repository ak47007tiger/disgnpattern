package visitor;

public class Client {

	public static void main(String[] args) {
		Element1 element1 = new Element1();
		Element2 element2 = new Element2();
		Visitor1 visitor1 = new Visitor1();
		element1.accept(visitor1);
		element2.accept(visitor1);
	}
}
