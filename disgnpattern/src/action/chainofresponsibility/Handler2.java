package chainofresponsibility;

public class Handler2 implements Handler {

	Handler successor;
	@Override
	public void setSuccessor(Handler handler) {
		successor = handler;
	}

	@Override
	public void handle(Request req) {
		System.out.println("handle2 do something");
		if(null != successor){
			successor.handle(req);
		}
	}

}
