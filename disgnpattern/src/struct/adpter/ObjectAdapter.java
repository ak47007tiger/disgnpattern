package adpter;

public class ObjectAdapter implements FunctionAble{
	Source source;

	@Override
	public void f1() {
		System.out.println("f1");
	}

	@Override
	public void f2() {
		System.out.println("f2");
	}
}
