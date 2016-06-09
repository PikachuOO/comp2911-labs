
public class Celery extends DecoratorSoup {

	private int cost;
	private DecoratorSoup decorated;
	
	public Celery(DecoratorSoup decorated) {
		this.cost = 30;
		this.decorated = decorated;
	}
	
	@Override
	public int getCost() {
		return decorated.getCost() + this.cost;
	}
	
	@Override
	public String toString() {
		return decorated.toString() + ", celery";
	}
}
