package memento;

public class Origin {

	int val;
	public void init(int i) {
		this.val = i;
	}
	public int getVal() {
		return val;
	}
	public void change(int i) {
		val = i;
	}
	public BackUp backup() {
		BackUp backUp = new BackUp();
		backUp.setVal(val);
		return backUp;
	}
	public void restore(BackUp backup) {
		val = backup.getVal();
	}

}
