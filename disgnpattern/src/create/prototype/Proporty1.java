package prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

public class Proporty1 implements Proporty , Serializable, Cloneable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3239554962831323793L;

	String name;
	Date time;
	RefTest refTest;
	public Proporty1(String name, Date time, RefTest refTest) {
		this.name = name;
		this.time = time;
		this.refTest = refTest;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	@Override
	public Proporty deepClone() throws IOException, ClassNotFoundException {

		ByteArrayOutputStream bos = new ByteArrayOutputStream();  
		ObjectOutputStream oos = new ObjectOutputStream(bos);  
		oos.writeObject(this); 


		ByteArrayInputStream bais = new ByteArrayInputStream(bos.toByteArray());
		ObjectInputStream objIs = new ObjectInputStream(bais);
		return (Proporty) objIs.readObject();
	}

	@Override
	public Proporty clone(){
		Proporty obj = null;
		try {
			obj = (Proporty) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			return obj;
		}
		return obj;
	}

	@Override
	public void say() {
		System.out.println("name:" + name + ", time:" + time.toString());
	}
}
