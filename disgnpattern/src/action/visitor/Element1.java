package visitor;

public class Element1 {

	public void accept(Visitor1 visitor1){
		visitor1.visit(this);
	}
}
