package decorator;

public abstract class AbstractSource implements Source{
	Source source;
	public AbstractSource(Source source) {
		this.source = source;
	}
	public abstract void beforeDo();
	public abstract void afterDo();
	@Override
	public void dosomething() {
		beforeDo();
		source.dosomething();
		afterDo();
	}
}
