import java.util.LinkedList;

public class UseGraph<E> implements Graph<E> {

	private LinkedList<Node<E>> nodes;
	
	public UseGraph() {
		nodes = new LinkedList<Node<E>>();
	}
	
	public boolean addNode(Node<E> n) {
		nodes.add(n);
		return true;
	}
	
	public Node<E> addNode(E value) {
		Node<E> n = new Node<E>(value);
		nodes.add(n);
		return n;
	}
	
	public void printGraph() {
		for (Node<E> n : nodes) {
			System.out.println(n.toString());
		}
	}
	
	public boolean addEdge(Node<E> one, Node<E> two, int weight) {
		Edge e = new Edge(one, two, weight);
		one.addEdge(e);
		two.addEdge(e);
		return true;
	}
}
