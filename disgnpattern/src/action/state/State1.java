package state;

public class State1 implements State{

	@Override
	public void changeState(Context context) {
		System.out.println("stat1 -> state2");
		context.state = new State2();
	}

}
