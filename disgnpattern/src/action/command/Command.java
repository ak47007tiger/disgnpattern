package command;

public interface Command {

	void exec();
	void undo();
	void setTarget(Receiver reciever);
}
