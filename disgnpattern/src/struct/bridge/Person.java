package bridge;

public abstract class Person {
	public abstract void read();

	Book book;
	public void setBook(Book book) {
		this.book = book;
	}
}
