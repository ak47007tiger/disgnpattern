package facade;

public class Client {

	public static void main(String[] args) {
		Searcher searcher = new Searcher();
		Person person = searcher.search("name");
		person.showInfo();
	}
}
