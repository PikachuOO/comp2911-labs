
public interface Graph<E> {

//	public boolean addNode(Node<E> n);
//	public boolean removeNode(Node<E> n);
	public boolean addEdge(Edge e);
	public boolean removeEdge(Edge e);
	public int getNumVertices();
	public int getNumEdges();
}