package iterator;

public class AggregateImpl implements Aggregate {

	Element[] elements = new Element[16];
	int curIndex = 0;
	@Override
	public Iterator getIterator() {
		Iterator iterator = new IteratorImpl(this);
		return iterator;
	}

	@Override
	public void addElement(Element element) {
		elements[curIndex++] = element;
	}

}
