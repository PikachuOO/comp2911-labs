
public class Edge<E> {

	private Node<E> nodeFrom;
	private Node<E> nodeTo;
	int weight;
	
	public Edge(Node<E> nodeFrom, Node<E> nodeTo, int weight) {
		this.nodeFrom = nodeFrom;
		this.nodeTo = nodeTo;
		this.weight = weight;
	}
}
