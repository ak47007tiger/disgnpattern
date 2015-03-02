package bridge;

public class Client {

	public static void main(String[] args) {
		Person small = new SmallPerson();
		Person big = new BigPerson();
		Person old = new OldPerson();
		
		Book easyStory = new EasyStory();
		Book comStory = new ComStory();
		
		Position school = new School();
		Position street = new Street();
		
		easyStory.setPosition(school);
		comStory.setPosition(street);
		small.setBook(easyStory);
		big.setBook(comStory);
		old.setBook(easyStory);
		
		small.read();
		big.read();
		old.read();
		old.setBook(comStory);
		old.read();
	}
}
