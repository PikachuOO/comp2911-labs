
public class AdjacencyMatrix<E> implements Graph<E> {
	
	private int[][] AdjacencyMatrix;
	
	public AdjacencyMatrix(int size) {
		AdjacencyMatrix = new int[size][size];
	}
	
	public boolean addEdge(Edge<E> n) {
		return false;
	}
	
	public boolean removeEdge(Edge<E> n) {
		return false;
	}
	
	public int numVertices() {
		return -1;
	}
	
	public int numEdges() {
		return -1;
	}
}
