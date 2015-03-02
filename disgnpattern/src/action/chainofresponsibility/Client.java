package chainofresponsibility;

public class Client {

	public static void main(String[] args) {
		Handler handler1 = new Handler1();
		Handler handler2 = new Handler2();
		Request req = new Request();
		handler1.setSuccessor(handler2);
		handler1.handle(req);
	}
}
