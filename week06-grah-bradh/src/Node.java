
import java.util.ArrayList;

public class Node<E> {
	
	private E element;
	private int hCost;
	private ArrayList<Edge> edges;

	/**
	 * Constructor for a new node
	 * @param nodeData the data to be stored on this node
	 * @param heuristicCost the cost to get from this node to the goal state
	 */
	public Node(E nodeData, int heuristicCost) {
		element = nodeData;
		hCost = heuristicCost;
		edges = new ArrayList<Edge>();
	}

	/**
	 * Method to create a new edge between two nodes
	 * TODO: check that the edge doesn't already exist - or maybe 
	 * multiple edges is permitted? 
	 * @param nodeTo the node you are connecting to
	 * @param edgeCost the cost to traverse this edge
	 */
	public void createEdgeTo(Node<E> nodeTo, int edgeCost) {
		Edge newEdge = new Edge(this, nodeTo, edgeCost);
		
		edges.add(newEdge);
		
		// To make this graph undirected we need to add this
		// edge in reverse too. 
		// NOTE: because this code is inside Node.java I can
		// directly access the private data of nodeTo
		// this is probably not very good programming sytle. 
		nodeTo.edges.add(newEdge);
		
	}

	public int getHCost() {
		return hCost;
	}

	public ArrayList<Edge> getEdges() {
		return edges;
	}

	public String toString() {
		return element.toString();
	}
	
	public E getElement() {
		return element;
	}
}
