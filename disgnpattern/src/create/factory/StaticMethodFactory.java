package factory;

public class StaticMethodFactory {

	public static Boom createBoom1() {
		return new Boom1();
	}
	public static Boom createBoom2(){
		return new Boom2();
	}
}
