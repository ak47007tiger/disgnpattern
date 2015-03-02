package state;

public class State2 implements State{

	@Override
	public void changeState(Context context) {
		System.out.println("state2 -> state1");
		context.state = new State1();
	}

}
