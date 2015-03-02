package chainofresponsibility;

public interface Handler {

	void setSuccessor(Handler handler2);

	void handle(Request req);

}
