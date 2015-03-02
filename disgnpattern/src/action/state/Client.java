package state;

public class Client {

	public static void main(String[] args) {
		Context context = new Context();
		context.state = new State1();
		context.action();
		context.action();
		context.action();
	}
}
