import java.util.ArrayList;

public class AdjacencyMatrix<E> implements Graph<E> {
	
//	private Edge[][] adjacencyMatrix;
	private ArrayList<E>[][] adjacencyMatrix;
	private int numVertices;
	private int numEdges;
	
	public AdjacencyMatrix() {
		adjacencyMatrix = new ArrayList[0][0];
		numVertices = 0;
		numEdges = 0;
	}

	@Override
	public boolean addNode(E e) {
		if (!nodeExists(e)) {
			Node n = new Node(e);
			insertNode(n);
			return true;
		}
		return false;
	}

	@Override
	public boolean removeNode(E e) {
		if (nodeExists(e)) {
			removeNode(n);
			return true;
		}
		return false;
	}
	
	private boolean nodeExists(E findE) {
		for (ArrayList<E>[] e : adjacencyMatrix) {
			if (e.equals(findE)) {
				return true;
			}
		}
		return false;
	}
	
	private void insertNode(Node n) {
		adjacencyMatrix.add(n);		// TODO
	}
	
	@Override
	public boolean addEdge(Edge<E> e) {
		
		Node<E> one = e.getNodeOne();
		Node<E> two = e.getNodeTwo();
		
		int oneNumber = one.getNumber();
		int twoNumber = two.getNumber();
		
		if (adjacencyMatrix[oneNumber][twoNumber] != null ||
				adjacencyMatrix[twoNumber][oneNumber] != null) {
			return false;
		}
				
		adjacencyMatrix[oneNumber][twoNumber] = e;
		adjacencyMatrix[twoNumber][oneNumber] = e;

		numEdges += 1;
		
		return true;
	}
	
	public boolean removeEdge(Edge e) {

		Node<E> one = e.getNodeOne();
		Node<E> two = e.getNodeTwo();
		
		int oneNumber = one.getNumber();
		int twoNumber = two.getNumber();
		
		if (adjacencyMatrix[oneNumber][twoNumber] == null ||
				adjacencyMatrix[twoNumber][oneNumber] == null) {
			return false;
		}
				
		adjacencyMatrix[oneNumber][twoNumber] = null;
		adjacencyMatrix[twoNumber][oneNumber] = null;
		
		numEdges -= 1;

		return false;
	}
	
	public int getNumVertices() {
		return numVertices;
	}
	
	public int getNumEdges() {
		return numEdges;
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

}
