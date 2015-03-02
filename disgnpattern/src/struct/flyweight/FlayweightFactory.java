package flyweight;

import java.util.ArrayList;
import java.util.List;

public class FlayweightFactory {

	List<Entity> entities = new ArrayList<Entity>();
	
	public void add(Entity entity){
		entities.add(entity);
	}
	public Entity get(int nextInt, int nextInt2) {
		for(Entity entity : entities){
			if(entity.match(nextInt, nextInt2)){
				return entity;
			}
		}
		return null;
	}

}
