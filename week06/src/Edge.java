
public class Edge<E> {

	private Node<E> nodeOne;
	private Node<E> nodeTwo;
	int weight;
	
	public Edge(Node<E> nodeOne, Node<E> nodeTwo, int weight) {
		this.nodeOne = nodeOne;
		this.nodeTwo = nodeTwo;
		this.weight = weight;
	}
	
	public Node<E> getOtherNode(Node<E> n) {
		if (n == nodeOne) {
			return nodeTwo;
		}
		return nodeOne;
	}
	
	public int getWeight() {
		return weight;
	}
}
