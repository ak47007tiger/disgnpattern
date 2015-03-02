package templatemethod;

public abstract class Parent {
	public void bit(){
		say();
		method();
	}
	protected void say(){
		System.out.println("bit you");
	}
	protected abstract void method();
}
