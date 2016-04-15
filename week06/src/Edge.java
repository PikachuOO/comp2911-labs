
public class Edge {

	private Node<E> nodeOne;
	private Node<E> nodeTwo;
	int weight;
	
	public Edge(Node<E> nodeOne, Node<E> nodeTwo, int weight) {
		this.nodeOne = nodeOne;
		this.nodeTwo = nodeTwo;
		this.weight = weight;
	}
	
	public Node<E> getNodeOne() {
		return nodeOne;
	}
	
	public Node<E> getNodeTwo() {
		return nodeTwo;
	}
}
