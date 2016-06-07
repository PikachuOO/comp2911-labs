import java.util.ArrayList;

public class NodeState<E> {

//	private ArrayList<Node<E>> previousNodes;
	private Node<E> previousNode;
	
	public NodeState() {
//		previousNodes = new ArrayList<Node<E>>();
		previousNode = null;
	}
	
	public void printPrevious() {
		if (previousNode != null) {
			previousNode.printPrevious();
			System.out.print(previousNode.toString() + " -> ");
		}
		previousNode = null;
	}
	
	public void addPrevious(Node<E> n) {
//		previousNodes.add(n);
		previousNode = n;
	}
	
}
