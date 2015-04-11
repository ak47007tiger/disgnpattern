package decorator;

public class Client {

	public static void main(String[] args) {
		Source source = new SourceImpl();
		Source func1 = new Func1(source);
		Source func2 = new Func2(func1);
		func2.dosomething();
	}
}
