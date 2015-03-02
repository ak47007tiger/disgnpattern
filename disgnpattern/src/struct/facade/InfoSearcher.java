package facade;

public abstract class InfoSearcher {

	InfoSearcher nextSearcher;
	public abstract void search(Person person);
	public void doSearch(Person person){
		search(person);
		if(null != nextSearcher){
			nextSearcher.doSearch(person);
		}
	}
	public void setNext(InfoSearcher searcher){
		nextSearcher = searcher;
	}
}
