package visitor;

public class Element2 {
	public void accept(Visitor1 visitor1){
		visitor1.visit(this);
	}
}
