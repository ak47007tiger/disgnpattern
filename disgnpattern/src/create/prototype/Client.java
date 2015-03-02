package prototype;

import java.util.Date;

public class Client {

	public static void main(String[] args) throws Exception {
		Proporty p1 = new Proporty1("p1", new Date(), new RefTest());
		p1.say();

		Proporty cp1;
		cp1 = p1.clone();
		cp1.say();

		Proporty dcp1;
		dcp1 = p1.deepClone();
		dcp1.say();
		System.out.println(p1.equals(cp1));
		System.out.println(p1.equals(dcp1));
		Date time_p1 = ((Proporty1)p1).time;
		Date time_cp1 = ((Proporty1)cp1).time;
		Date time_dcp1 = ((Proporty1)dcp1).time;
		System.out.println(time_p1.equals(time_cp1));
		System.out.println(time_p1.equals(time_dcp1));
		RefTest ref_p1 = ((Proporty1)p1).refTest;
		RefTest ref_cp1 = ((Proporty1)cp1).refTest;
		RefTest ref_dcp1 = ((Proporty1)dcp1).refTest;
		System.out.println(ref_p1.equals(ref_cp1));
		System.out.println(ref_p1.equals(ref_dcp1));
	}
}
