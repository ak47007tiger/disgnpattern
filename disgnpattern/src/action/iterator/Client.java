package iterator;

public class Client {

	public static void main(String[] args) {
		Aggregate aggregate = new AggregateImpl();
		aggregate.addElement(new Element(1));
		aggregate.addElement(new Element(2));
		Iterator iterator = aggregate.getIterator();
		while(iterator.hasNext()){
			Element element = iterator.next();
			System.out.println(element.val);
		}
	}
}
