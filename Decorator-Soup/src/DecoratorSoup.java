
public class DecoratorSoup implements ISoup {

	private int cost;
	
	public DecoratorSoup() {
		this.cost = 100;
	}
	
	@Override
	public int getCost() {
		return this.cost;
	}
	
	@Override
	public String toString() {
		return "Water";
	}
	
}
