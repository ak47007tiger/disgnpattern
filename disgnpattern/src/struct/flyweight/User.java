package flyweight;

public class User {

	Entity entity;
	public void setEntity(Entity entity) {
		this.entity = entity;
	}

	public void useEntity() {
		System.out.println(entity.sizeMin + "<= val <=" + entity.sizeMax);
	}

}
