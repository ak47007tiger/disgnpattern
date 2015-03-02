package state;

public class Context {

	State state;
	void action(){
		state.changeState(this);
	}
}
