import java.util.ArrayList;

public class AdjacencyMatrixSimple<E> implements Graph<E> {
	private int numVertices;
	private int numEdges;
	private boolean[][] adjMatrix;
	private Node<E>[] nodeArray;

	public AdjacencyMatrixSimple(int size) {
		numVertices = size;
		numEdges = 0;
		adjMatrix = new boolean[size][size];
		nodeArray = new Node[size];
	}
	
	@Override
	public boolean addNode(E e) {
		Node n = new Node(e);
		
		for (Node check : nodeArray) {
			if (e.equals(check)) {
				return false;
			}
		}
		
		return false;
	}

	@Override
	public boolean removeNode(E e) {
		// TODO Auto-generated method stub
		return false;
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
		return numVertices;
	}
	@Override
	public int getNumEdges() {
		return numEdges;
	}

	@Override
	public boolean nodeExists(E e) {
		// TODO Auto-generated method stub
		return false;
	}
}
