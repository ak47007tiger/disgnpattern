package flyweight;

public class Entity {
	int sizeMin;
	int sizeMax;
	String val;
	public static Entity build(int sizeMin, int sizeMax){
		Entity entity = new Entity();
		entity.sizeMin = sizeMin;
		entity.sizeMax = sizeMax;
		return entity;
	}
	public boolean match(int sizeMin, int sizeMax){
		return this.sizeMin == sizeMin && this.sizeMax == sizeMax;
	}
	@Override
	public boolean equals(Object obj) {
		Entity target = (Entity) obj;
		return this.sizeMin == target.sizeMin && this.sizeMax == target.sizeMax;
	}
}
