package decorator;

public class Func2 extends AbstractSource {

	public Func2(Source func1) {
		super(func1);
	}

	@Override
	public void beforeDo() {
		System.out.println("func2 before do");
	}

	@Override
	public void afterDo() {
		System.out.println("func2 after do");
	}

}
