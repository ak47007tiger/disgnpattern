package facade;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Person {
	Map<String, String> infosInContory = new HashMap<String, String>();
	String name;
	public void showInfo() {
		Iterator<String> iterator = infosInContory.keySet().iterator();
		while (iterator.hasNext()) {
			System.out.println(infosInContory.get(iterator.next()));
		}
	}
}
