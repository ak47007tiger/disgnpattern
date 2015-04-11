package proxy;

public class Proxy implements Type {

	Type type;
	public Proxy(Type impl1) {
		if(null == impl1){
			type = new Impl1();
		}else{
			type = impl1;
		}
	}
	@Override
	public void dusomething() {
		System.out.println("proxy before");
		type.dusomething();
		System.out.println("proxy after");
	}

}
