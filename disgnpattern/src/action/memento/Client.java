package memento;

public class Client {

	public static void main(String[] args) {
		Origin origin = new Origin();
		origin.init(1);
		System.out.println(origin.getVal());
		BackUp backup = origin.backup();
		origin.change(2);
		System.out.println(origin.getVal());
		origin.restore(backup);
		System.out.println(origin.getVal());
	}
}
