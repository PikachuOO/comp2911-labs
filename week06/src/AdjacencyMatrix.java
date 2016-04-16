import java.util.ArrayList;

public class AdjacencyMatrix<E> implements Graph<E> {
	
//	private Edge[][] adjacencyMatrix;
	private ArrayList[][] adjacencyMatrix;
	private int numVertices;
	private int numEdges;
	
	public AdjacencyMatrix() {
		adjacencyMatrix = new ArrayList[0][0];
		numVertices = 0;
		numEdges = 0;
	}

	@Override
	public boolean addNode(Node<E> n) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeNode(Node<E> n) {
		// TODO Auto-generated method stub
		return false;
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

}
