package composite;

import java.util.ArrayList;
import java.util.List;

public class Node {

	List<Node> children = new ArrayList<Node>();
	public void addNode(Node child1) {
		children.add(child1);
	}

}
