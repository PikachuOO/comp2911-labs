
public class Edge<E> {

	private E nodeOne;
	private E nodeTwo;
	private int weight;
	
	public Edge(E nodeOne, E nodeTwo, int weight) {
		this.nodeOne = nodeOne;
		this.nodeTwo = nodeTwo;
		this.weight = weight;
	}
	
	public String toString() {
		return "{" + nodeOne.toString() + ", " + nodeTwo.toString() + ", " + weight + "}";
	}
}
