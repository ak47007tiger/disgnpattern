package decorator;

public class Func1 extends AbstractSource {

	public Func1(Source source) {
		super(source);
	}
	/*@Override
	public void dosomething() {
		super.dosomething();
		System.out.println("func1 only do after");
	}*/
	@Override
	public void beforeDo() {
		System.out.println("func1 before do");
	}

	@Override
	public void afterDo() {
		System.out.println("func1 after do");
	}
}
