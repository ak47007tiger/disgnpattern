package facade;

public class UsSearcher extends InfoSearcher {

	@Override
	public void search(Person person) {
		person.infosInContory.put("us_key1", "在美国哈佛看过书");
	}

}
