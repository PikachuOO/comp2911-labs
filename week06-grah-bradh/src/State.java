
public class State implements Comparable<State> {
	
	private Node<?> currentNode;
	private int gCost;
	private State prevState;

	/**
	 * Constructor for a new state
	 * @param cNode the current node
	 * @param costSoFar the cost to this point so far
	 * @param pState the previous state
	 */
	public State(Node<?> cNode, int costSoFar, State pState) {
		currentNode = cNode;
		gCost = costSoFar;
		prevState = pState;
	}

	@Override
	public int compareTo(State o) {
		return calculateFCost() - o.calculateFCost();
	}

	private int calculateFCost() {
		return gCost + currentNode.getHCost();
	}

	public Node<?> getNode() {
		return currentNode;
	}

	public int getGCost() {
		return gCost;
	}

	public void printCurrentPathAndCosts() {
		String toPrint = getPathString("");
		System.out.println(toPrint + " fCost = " + calculateFCost() + " gCost = " + gCost + " hCost = " + currentNode.getHCost());
	}

	/**
	 * Recursive method to print the path out using previous states
	 * @param s the string to append to
	 * @return an appended string
	 */
	private String getPathString(String s) {
		String returnString = currentNode.toString().concat(s);
		if (prevState != null) {
			return prevState.getPathString(" -> " +returnString);
		}
		return returnString;
	}

}