package facade;


public class Searcher {

	InfoSearcher firstSearcher;
	public Searcher() {
		InfoSearcher chinaSearcher = new ChinaSearcher();
		InfoSearcher usSearcher = new UsSearcher();
		chinaSearcher.setNext(usSearcher);
		firstSearcher = chinaSearcher;
	}
	public Person search(String name) {
		Person person = new Person();
		person.name = name;
		firstSearcher.doSearch(person);
		return person;
	}

}
