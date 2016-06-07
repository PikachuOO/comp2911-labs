import java.util.ArrayList;

public class GraphAgainRedux<E> implements Graph<E> {

	private ArrayList<ArrayList<Node<E>>> adjMatrix;
	private int numVertices;
	private int numEdges;
	
	public GraphAgainRedux() {
		adjMatrix = new ArrayList<ArrayList<Node<E>>>();
		numVertices = 0;
		numEdges = 0;
	}
	
	@Override
	public boolean addNode(E e) {
		if (!nodeExists(e)) {
			Node<E> n = new Node<>(e);
			ArrayList<Node<E>> al = new ArrayList<>();
			
			al.add(n);
			adjMatrix.add(al);
			
//			System.out.println("added (redux): " + n.getValue());
			numVertices += 1;
			return true;
		}
		return false;
	}
	
	@Override
	public boolean nodeExists(E e) {
		for (ArrayList<Node<E>> al : adjMatrix) {
			for (Node<E> n : al) {
				if (n.getValue() == e) {
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public boolean removeNode(E e) {
		if (nodeExists(e)) {
			for (ArrayList<Node<E>> al : adjMatrix) {
				for (Node<E> n : al) {
					if (n.getValue() == e) {
//						System.out.println("removing: " + n.getValue());
						al.remove(n);
						adjMatrix.remove(al);
						numVertices -= 1;
						return true;
					}
				}
			}
		}
		return false;
	}

	public void printGraph() {
		int x, y;
		x = 0;
		y = 0;
		for (ArrayList<Node<E>> al : adjMatrix) {
			y = 0;
			x += 1;
			Node<E> currNode = al.get(0);
			System.out.print(x + "  (" + currNode.getValue() + ") : ");
			for (Node<E> n : al) {
				y += 1;
				System.out.print("[" + y + ":" + n.getValue() + "]");
			}
			System.out.println("");
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