import java.util.ArrayList;

public class GraphAgain<E> implements Graph<E> {

	private ArrayList<Node<E>> nodes;
	
	public GraphAgain() {
		nodes = new ArrayList<Node<E>>();
	}
	
	@Override
	public boolean addNode(E e) {
		if (!nodeExists(e)) {
			Node<E> n = new Node<>(e);
			System.out.println("added: " + n.getValue() + ", size: " + nodes.size());
			nodes.add(n);
			return true;
		}
		return false;
	}
	
	@Override
	public boolean nodeExists(E e) {
		for (Node<E> n : nodes) {
			if (n.getValue() == e) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean removeNode(E e) {
		if (nodeExists(e)) {
			for (Node<E> n : nodes) {
				if (n.getValue() == e) {
					System.out.print("removing: " + n.getValue());
					nodes.remove(n);
					System.out.println(", size: " + nodes.size());
					return true;
				}
			}
		}
		return false;
	}

	public void printGraph() {
		System.out.println(nodes.size());
		for (Node<E> n : nodes) {
			System.out.println(n.getValue());
		}
	}
	
	@Override
	public boolean addEdge(E nodeOne, E nodeTwo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeEdge(E nodeOne, E nodeTwo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getNumVertices() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getNumEdges() {
		// TODO Auto-generated method stub
		return 0;
	}
}
