public class Edge {
	
	private Node<?> from;
	private Node<?> to;
	private int cost;

	/**
	 * Constructor for an edge
	 * @param nodeFrom one end of the edge
	 * @param nodeTo the other end of the edge
	 * @param edgeCost the cost to traverse the edge
	 */
	public Edge(Node<?> nodeFrom, Node<?> nodeTo, int edgeCost) {
		from = nodeFrom;
		to = nodeTo;
		cost = edgeCost;
	}

	/**
	 * Method to return the other end of an edge.
	 * NOTE: this method does not check if this node actually contains
	 * the edge that is passed into it.
	 * @param node
	 * @return
	 */
	public Node<?> getOtherEnd(Node<?> node) {
		if (from == node) {
			return to;
		}
		return from;
	}

	public int getEdgeCost() {
		return cost;
	}

}