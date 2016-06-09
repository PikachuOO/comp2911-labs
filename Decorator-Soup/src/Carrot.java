
public class Carrot extends DecoratorSoup {

	private int cost;
	private DecoratorSoup decorated;
	
	public Carrot(DecoratorSoup decorated) {
		this.cost = 20;
		this.decorated = decorated;
	}
	
	@Override
	public int getCost() {
		return decorated.getCost() + this.cost;
	}
	
	@Override
	public String toString() {
		return decorated.toString() + ", carrot";
	}
}
