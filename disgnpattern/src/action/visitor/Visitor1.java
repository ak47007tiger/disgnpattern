package visitor;

public class Visitor1 {

	public void visit(Element1 element1){
		System.out.println("visit " + element1.getClass().getSimpleName());
	}
	public void visit(Element2 element2){
		System.out.println("visit " + element2.getClass().getSimpleName());
	}
}
