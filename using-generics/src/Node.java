import java.util.LinkedList;

public class Node<E> {

	private E value;

	// Edge has to be a generic type because it's declared as that
	private LinkedList<Edge<Node<E>>> edges;
	
	// This can forego the generic since EdgeTwo has <?> in it 
	private LinkedList<EdgeTwo> edgesTwo;
	
	public Node(E val) {
		value = val;
	}
	
	public void setValue(E val) {
		value = val;
	}
	
	private E getValue() {
		return value;
	}
	
	public String toString() {
		return value.toString();
	}
	
	public boolean addEdge(Node<E> toNode, int weight) {
		EdgeTwo e = new EdgeTwo(this, toNode, weight);
		edgesTwo.add(e);
		return true;
	}
	
	public boolean addEge(EdgeTwo e) {
		edgesTwo.add(e);
		return true;
	}
	
	public void printNode() {
		if (edges.isEmpty()) {
			System.out.println(value.toString());
		} else {
			for (EdgeTwo e : edgesTwo) {
				System.out.println(e.toString());
			}
		}
	}
}
