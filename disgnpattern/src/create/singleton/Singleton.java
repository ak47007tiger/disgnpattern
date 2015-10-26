package singleton;

public class Singleton {
	private static Singleton singleton; 
	static{
		singleton = new Singleton();
	}
	public static Singleton getGlobal(){
		return singleton;
	}
	public void doSomeThing(){
		System.out.println("do");
	}
	public static void main(String[] args) {
		Singleton.getGlobal().doSomeThing();
	}
}
