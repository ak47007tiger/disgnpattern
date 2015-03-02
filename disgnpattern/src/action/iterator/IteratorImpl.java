package iterator;

public class IteratorImpl implements Iterator {

	Element[] elements;
	public IteratorImpl(AggregateImpl aggregateImpl) {
		elements = aggregateImpl.elements;
	}
	int curIndex;
	@Override
	public boolean hasNext() {
		if(curIndex >= elements.length){
			return false;
		}
		return null != elements[curIndex];
	}

	@Override
	public Element next() {
		return elements[curIndex++];
	}

}
