
public class State<E> implements Comparable<E> {

	private Node<E> previousNode;
	private Node<E> currentNode;
	private int f;
	private int g;
	private int h;
	
	public State(Node<E> n, Node<E> prev, int g) {
		currentNode = n;
		previousNode = prev;
		this.g = g;
		this.h = n.getHueristicCost();
		this.f = g + h;
	}
	
	public E getCurrentNode() {
		return currentNode;
	}
	
	public void printPrevious() {
		if (previousNode != null) {
			previousNode.printPrevious();
			System.out.print(previousNode.toString() + " -> ");
		}
		previousNode = null;
	}
	
	public String toString() {
		return currentNode.toString();
	}
	
	public int getFCost() {
		return f;
	}
	
	public int compareTo(E n) {
		if (n.getFCost() == this.getFCost()) {
			return 0;
		} else if (n.getFCost() > this.getFCost()) {
			return 1;
		}
		
		return -1;
	}
}
