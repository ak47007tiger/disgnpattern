package proxy;

public class Client {

	public static void main(String[] args) {
		Type impl1 = new Impl1();
		Type proxy = new Proxy(impl1);
		proxy.dusomething();
	}
}
