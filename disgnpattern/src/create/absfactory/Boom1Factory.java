package absfactory;

public class Boom1Factory implements BoomFactory{

	@Override
	public Boom create() {
		return new Boom1();
	}

}
