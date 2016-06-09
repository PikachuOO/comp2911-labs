
public class Chicken extends DecoratorSoup {

	private int cost;
	private DecoratorSoup decorated;
	
	public Chicken(DecoratorSoup decorated) {
		this.cost = 50;
		this.decorated = decorated;
	}
	
	@Override
	public int getCost() {
		return decorated.getCost() + this.cost;
	}
	
	@Override
	public String toString() {
		return decorated.toString() + ", chicken";
	}
}
