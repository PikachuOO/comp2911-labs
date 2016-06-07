import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;

public class AdjacencyList<E> implements Graph<E> {

	private LinkedList<Node<E>> nodes;
	private int numVertices;
	private int numEdges;
	
	public AdjacencyList() {
		nodes = new LinkedList<Node<E>>();
		numVertices = 0;
		numEdges = 0;
	}
	
	@Override
	public boolean addNode(Node<E> n) {
		if (nodes.contains(n)) {
			return false;
		}

		nodes.add(n);
		numVertices += 1;
		return true;
	}

	@Override
	public boolean removeNode(Node<E> n) {
		if (nodes.contains(n)) {
			nodes.remove(n);
			numVertices -= 1;
			return true;
		}
		return false;
	}

	@Override
	public boolean addEdge(Node<E> nodeOne, Node<E> nodeTwo, int edgeCost) {
		Edge<E> e = new Edge<E>(nodeOne, nodeTwo, edgeCost);
		if (nodeOne.addEdge(e) && nodeTwo.addEdge(e)) { 
			numEdges += 1;
			return true;
		}
		return false;
	}

	@Override
	public boolean removeEdge(Node<E> nodeOne, Node<E> nodeTwo) {
		if (nodeOne.removeEdge(nodeTwo) && nodeTwo.removeEdge(nodeOne)) {
			numEdges -= 1;
			return true;
		}
		return false;
	}

	@Override
	public int getNumVertices() {
		return numVertices;
	}

	@Override
	public int getNumEdges() {
		return numEdges;
	}

	@Override
	public boolean nodeExists(Node<E> n) {
		return nodes.contains(n);
	}

	// plain BFS
	@Override
	public boolean bfs(Node<E> fromNode, Node<E> toNode) {
		LinkedBlockingQueue<Node<E>> q = new LinkedBlockingQueue<Node<E>>();
		LinkedList<Node<E>> seen = new LinkedList<Node<E>>();

		try {
			q.put(fromNode);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		while (!q.isEmpty()) {
			Node<E> n = q.poll();
			seen.add(n);
			
			if (n == toNode) {
				System.out.print("Found! ");
				n.printPrevious();
				System.out.println(n.toString());
				return true;
			}
			
			for (Edge<E> e : n.getEdges()) {
				try {
					Node<E> other = e.getOtherNode(n); 
					if (!seen.contains(other)) {
						q.put(other);
						other.addPrevious(n);
					}
					 
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}

		}
		return false;
	}
	
	// attempting to implement BFS as a state search
	public boolean bfsState(Node<E> fromNode, Node<E> toNode) {
		LinkedBlockingQueue<State<Node<E>>> q = new LinkedBlockingQueue<State<Node<E>>>();
		LinkedList<State<Node<E>>> seen = new LinkedList<State<Node<E>>>();

		try {
			State<Node<E>> s = new State(fromNode, null, 0);
			q.put(s);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		while (!q.isEmpty()) {
			State<Node<E>> s = q.poll();
			seen.add(s);
			
			if (s.getCurrentNode() == toNode) {
				s.printPrevious();
				System.out.println(s.toString());
				return true;
			}
			
			Node<E> n = s.getCurrentNode();
			
			for (Edge<E> e : n.getEdges()) {
				try {
					Node<E> other = e.getOtherNode(n); 
					if (!seen.contains(other)) {
						q.put(other);
						other.addPrevious(n);
					}
					 
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}

		}
		return false;
	}
	
	
	@Override
	public boolean aStar(Node<E> fromNode, Node<E> toNode) {
		PriorityQueue<State<Node<E>>> q = new PriorityQueue<State<Node<E>>>();

		State<Node<E>> s = new State<Node<E>>(fromNode, null, 0);
		q.add(s);
		
		while(!q.isEmpty()) {
			State<Node<E>> sNext = q.poll();
			System.out.println("aStar considering.. " + sNext.toString());
			
			if (sNext.getCurrentNode() == toNode) {
				System.out.print("Found! ");
				sNext.printPrevious();
				System.out.println(s.toString());
				System.out.println("aStar returning true");
				return true;
			}
			
			Node<E> n = s.getCurrentNode();

			for (Edge<E> e : n.getEdges()) {
				Node<E> other = e.getOtherNode(n); 
				State<Node<E>> newState = new State<Node<E>>(n, other, e.getWeight());

				try {
					q.add(newState);
				} catch (Exception e3) {
					e3.printStackTrace();
				}
			}
		}
		
		System.out.println("aStar returning false");
		return false;
	}
}
