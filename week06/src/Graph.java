
public interface Graph<E> {

	public boolean addNode(E e);
	public boolean removeNode(E e);
	public boolean addEdge(E nodeOne, E nodeTwo);
	public boolean removeEdge(E nodeOne, E nodeTwo);
	public int getNumVertices();
	public int getNumEdges();
}