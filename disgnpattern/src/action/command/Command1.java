package command;

public class Command1 implements Command {

	Receiver target;
	@Override
	public void exec() {
		target.doSomething1();
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
