package iterator;

public interface Aggregate {

	Iterator getIterator();

	void addElement(Element element);
}
