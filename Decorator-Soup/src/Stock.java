
public class Stock extends DecoratorSoup {

	private int cost;
	private DecoratorSoup decorated;
	
	public Stock(DecoratorSoup decorated) {
		this.cost = 10;
		this.decorated = decorated;
	}
	
	@Override
	public int getCost() {
		return decorated.getCost() + this.cost;
	}
	
	@Override
	public String toString() {
		return decorated.toString() + ", stock";
	}
}
