
public interface Graph<E> {

//	public boolean addNode(Node<E> n);
//	public boolean removeNode(Node<E> n);
	public boolean addEdge(Edge<E> e);
	public boolean removeEdge(Edge<E> e);
	public int numVertices();
	public int numEdges();
}