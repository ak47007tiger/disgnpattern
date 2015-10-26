package absfactory;

public class Boom2Factory  implements BoomFactory{

	@Override
	public Boom create() {
		return new Boom2();
	}
}
