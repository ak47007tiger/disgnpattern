package composite;

public class Client {

	public static void main(String[] args) {
		Node parent = new Node();
		Node child1 = new Node();
		parent.addNode(child1);
		Node child2 = new Node();
		parent.addNode(child2);
	}
}
