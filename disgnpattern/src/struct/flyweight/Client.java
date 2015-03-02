package flyweight;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Client {

	public static void main(String[] args) {
		FlayweightFactory factory = new FlayweightFactory();
		Random random = new Random(System.currentTimeMillis());
		List<User> users = new ArrayList<User>();
		factory.add(Entity.build(1, 9));
		factory.add(Entity.build(2, 9));
		factory.add(Entity.build(5, 9));
		factory.add(Entity.build(6, 9));
		for(int count = 0; count < 10; count++){
			User user1 = new User();
			int min = random.nextInt(10);
			int max = 10;
			Entity entity = factory.get(min,max);
			if(null == entity){
				entity = Entity.build(min, max);
			}
			user1.setEntity(entity);
			users.add(user1);
		}
		for(int count = 0; count < 10; count++){
			users.get(count).useEntity();
		}
	}
}
