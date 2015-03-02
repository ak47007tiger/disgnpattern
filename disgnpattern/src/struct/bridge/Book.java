package bridge;

public abstract class Book {

	Position position;
	public void setPosition(Position position) {
		this.position = position;
	}
	public abstract void showContent();
}
