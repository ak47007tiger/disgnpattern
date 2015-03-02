package command;

public class Client {

	public static void main(String[] args) {
		Invoker invoker = new Invoker();
		Receiver reciever = new Receiver();
		Command command1 = new Command1();
		Command command2 = new Command2();
		command1.setTarget(reciever);
		invoker.sendCammand(command1);
		command2.setTarget(reciever);
		invoker.sendCammand(command2);
	}
}
