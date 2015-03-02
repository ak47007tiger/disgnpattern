package templatemethod;

public class Client {
	public static void main(String[] args) {
		Parent parent1 = new Parent1();
		Parent parent2 = new Parent2();
		parent1.bit();
		parent2.bit();
	}
}
