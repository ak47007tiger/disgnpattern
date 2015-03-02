package strategy;

public class Context {

	public static final int SMALL = 0;
	public static final int MID = 1;
	public static final int BIG = 2;
	Attack attack;
	public void setAttackMethod(Attack attack) {
		this.attack = attack;
	}
	public void action() {
		attack.attack();
	}

}
