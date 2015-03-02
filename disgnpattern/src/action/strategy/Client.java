package strategy;

import java.util.Random;

public class Client {

	public static void main(String[] args) {
		Context context = new Context();
		int iden = new Random(System.currentTimeMillis()).nextInt(Context.BIG + 1);
		Attack attack = null;
		switch(iden){
		case Context.SMALL:
			attack = new SmallAttack();
			break;
		case Context.MID:
			attack = new MidAttack();
			break;
		case Context.BIG:
			attack = new BigAttack();
			break;
		}
		context.setAttackMethod(attack);
		context.action();
	}
}
