package command;

public class Command2 implements Command {

	Receiver target;
	@Override
	public void exec() {
		target.doSomething2();
	}

	@Override
	public void setTarget(Receiver reciever) {
		target = reciever;
	}

	@Override
	public void undo() {
		// TODO 自动生成的方法存根
		
	}

}
