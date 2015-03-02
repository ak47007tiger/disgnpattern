package facade;

public class ChinaSearcher extends InfoSearcher {

	@Override
	public void search(Person person) {
		person.infosInContory.put("china_key1", "中国海军");
	}

}
