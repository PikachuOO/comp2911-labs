import java.util.ArrayList;

public class Node<E> {

	private E value;
	private int hueristicCost;
	private ArrayList<Edge<E>> edges;
	private NodeState<E> nodeState;
	
	public Node(E value, int hueristicCost) {
		this.value = value;
		this.hueristicCost = hueristicCost;
		edges = new ArrayList<Edge<E>>();
		nodeState = new NodeState<E>();
	}
	
	public void printPrevious() {
		nodeState.printPrevious();
	}
	
	public void addPrevious(Node<E> n) {
		nodeState.addPrevious(n);
	}
	
	public E getValue() {
		return value;
	}
	
	public int getHueristicCost() {
		return hueristicCost;
	}
	
	public ArrayList<Edge<E>> getEdges() {
		return edges;
	}
	
	public String toString() {
		return value.toString();
	}
	
	public boolean addEdge(Edge<E> e) {
		if (edges.contains(e)) {
			return false;
		}
		edges.add(e);
		return true;
	}
	
	public boolean removeEdge(Node<E> n) {
		for (Edge<E> e : edges) {
			if (e.getOtherNode(this) == n) {
				edges.remove(e);
				return true;
			}
		}
		return false;
	}
}
