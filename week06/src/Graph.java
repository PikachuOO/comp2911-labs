
public interface Graph<E> {

	public boolean addNode(Node<E> e);
	public boolean removeNode(Node<E> e);
	public boolean addEdge(Node<E> nodeOne, Node<E> nodeTwo, int edgeCost);
	public boolean removeEdge(Node<E> nodeOne, Node<E> nodeTwo);
	public boolean nodeExists(Node<E> e);
	public int getNumVertices();
	public int getNumEdges();
	public boolean bfs(Node<E> fromNode, Node<E> toNode);
	public boolean aStar(Node<E> fromNode, Node<E> toNode);
}