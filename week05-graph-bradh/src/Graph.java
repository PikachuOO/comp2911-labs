import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;


public class Graph<E> {
	
	private ArrayList<Node<E>> nodes;
	
	/**
	 * Default constructor for creating an empty graph
	 */
	public Graph() {
		nodes = new ArrayList<Node<E>>();
	}

	/**
	 * Main method, bootstraps a graph for the 
	 * Romania map
	 * @param args are ignored.
	 */
	public static void main(String[] args) {
		
		// Create a graph object
		Graph<String> g = new Graph<String>();
		
		// Create node objects with name and heuristic value
		// NOTE: Often in A-Star you will need a method
		// for calculating heuristic values it will not
		// be given to you like this.
		// NOTE 2: These heuristic values are for finding a 
		// path to Bucharest they are not general heuristic values
		Node<String> aNode = new Node<String>("Arad", 366);
		Node<String> bNode = new Node<String>("Bucharest", 0);
		Node<String> cNode = new Node<String>("Craiova", 160);
		Node<String> dNode = new Node<String>("Dobreta", 242);
		Node<String> eNode = new Node<String>("Eforie", 161);
		Node<String> fNode = new Node<String>("Fagaras", 178);
		Node<String> gNode = new Node<String>("Giurgiu", 77);
		Node<String> hNode = new Node<String>("Hirsova", 151);
		Node<String> iNode = new Node<String>("Iasi", 226);
		Node<String> lNode = new Node<String>("Logoj", 244);
		Node<String> mNode = new Node<String>("Mehadia", 241);
		Node<String> nNode = new Node<String>("Neamt", 234);
		Node<String> oNode = new Node<String>("Oradea", 380);
		Node<String> pNode = new Node<String>("Pitesti", 98);
		Node<String> rNode = new Node<String>("Rimnicu Vilcea", 193);
		Node<String> sNode = new Node<String>("Sibiu", 253);
		Node<String> tNode = new Node<String>("Timisoara", 329);
		Node<String> uNode = new Node<String>("Urziceni", 80);
		Node<String> vNode = new Node<String>("Vaslui", 199);
		Node<String> zNode = new Node<String>("Zerin", 374);
		
		// Add the nodes to the graph
		g.addNode(aNode);
		g.addNode(bNode);
		g.addNode(cNode);
		g.addNode(dNode);
		g.addNode(eNode);
		g.addNode(fNode);
		g.addNode(gNode);
		g.addNode(hNode);
		g.addNode(iNode);
		g.addNode(lNode);
		g.addNode(mNode);
		g.addNode(nNode);
		g.addNode(oNode);
		g.addNode(pNode);
		g.addNode(rNode);
		g.addNode(sNode);
		g.addNode(tNode);
		g.addNode(uNode);
		g.addNode(vNode);
		g.addNode(zNode);
		
		// add edges between nodes
		// and the cost to traverse these edges
		// NOTE: this is missing the edges after Bucharest
		aNode.createEdgeTo(sNode,140);
		aNode.createEdgeTo(tNode,118);
		aNode.createEdgeTo(zNode,75);
		oNode.createEdgeTo(sNode,151);
		tNode.createEdgeTo(lNode,111);
		lNode.createEdgeTo(mNode,70);
		mNode.createEdgeTo(dNode,75);
		dNode.createEdgeTo(cNode,120);
		sNode.createEdgeTo(fNode,99);
		fNode.createEdgeTo(bNode,211);
		sNode.createEdgeTo(rNode,80);
		rNode.createEdgeTo(cNode,146);
		rNode.createEdgeTo(pNode,97);
		cNode.createEdgeTo(pNode,138);
		pNode.createEdgeTo(bNode,101);
		bNode.createEdgeTo(gNode,90);
		bNode.createEdgeTo(uNode,85);
		
		g.breadthFirstSearch(aNode, bNode);
		
//		g.aStarSearch(aNode, bNode);
		
	}

	private void breadthFirstSearch(Node<?> startNode, Node<?> endNode) {
		
	}

	/**
	 * Method to add a node into the list of nodes
	 * TODO: check that the node doesn't already exist
	 * @param node a node to add into the collection
	 */
	private void addNode(Node<E> node) {
		nodes.add(node);	
	}
	
	/**
	 * Method to find a route from A to B. 
	 * @param endNode 
	 * @param startNode 
	 */
	private void aStarSearch(Node<?> startNode, Node<?> endNode) {
		
		
	}
}
