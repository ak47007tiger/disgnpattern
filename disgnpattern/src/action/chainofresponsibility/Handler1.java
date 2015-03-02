package chainofresponsibility;

public class Handler1 implements Handler {

	Handler successor;
	@Override
	public void setSuccessor(Handler handler) {
		successor = handler;
	}

	@Override
	public void handle(Request req) {
		System.out.println("handle1 do something");
		if(null != successor){
			successor.handle(req);
		}
	}

}
