
public class AdjacencyMatrix<E> implements Graph<E> {
	
	private Edge[][] adjacencyMatrix;
	private int numVertices;
	private int numEdges;
	
	public AdjacencyMatrix(int size) {
		adjacencyMatrix = new Edge[size][size];
		numVertices = size;
		numEdges = 0;
	}
	
	public boolean addEdge(Edge e) {
		
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
}
