
public class EdgeTwo {

	private Node<?> nodeOne;
	private Node<?> nodeTwo;
	private int weight;
	
	public EdgeTwo(Node<?> nodeOne, Node<?> nodeTwo, int weight) {
		this.nodeOne = nodeOne;
		this.nodeTwo = nodeTwo;
		this.weight = weight;
	}

	public String toString() {
		return "{" + nodeOne.toString() + ", " + nodeTwo.toString() + ", " + weight + "}";
	}
}
