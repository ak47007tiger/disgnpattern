package factory;

public class NormalBoomFactory {
	public Boom createBoom(String id){
		switch (id) {
		case "Boom1":
			return StaticMethodFactory.createBoom1();
		case "Boom2":
			return StaticMethodFactory.createBoom2();
		default:
			return null;
		}
	}
}
