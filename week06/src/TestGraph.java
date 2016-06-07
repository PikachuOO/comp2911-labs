
import static org.junit.Assert.*;

import org.junit.Test;

public class TestGraph<E> {

//	AdjacencyMatrix<Node<E>> g = new AdjacencyMatrix<>();
//	AdjacencyMatrixSimple<String> g = new AdjacencyMatrixSimple<>(10);

//	GraphAgain<String> g = new GraphAgain<>();
//	GraphAgainRedux<String> gr = new GraphAgainRedux<>();
	
	AdjacencyList<String> al = new AdjacencyList<String>();

	
	@Test
	public void testAdjList() {
	
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
		al.addNode(aNode);
		al.addNode(bNode);
		al.addNode(cNode);
		al.addNode(dNode);
		al.addNode(eNode);
		al.addNode(fNode);
		al.addNode(gNode);
		al.addNode(hNode);
		al.addNode(iNode);
		al.addNode(lNode);
		al.addNode(mNode);
		al.addNode(nNode);
		al.addNode(oNode);
		al.addNode(pNode);
		al.addNode(rNode);
		al.addNode(sNode);
		al.addNode(tNode);
		al.addNode(uNode);
		al.addNode(vNode);
		al.addNode(zNode);
		
		// add edges between nodes
		// and the cost to traverse these edges
		// NOTE: this is missing the edges after Bucharest

		al.addEdge(aNode, sNode, 140);
		al.addEdge(aNode, tNode, 140);
		al.addEdge(aNode, zNode, 140);
		al.addEdge(oNode, sNode, 140);
		al.addEdge(tNode, lNode, 140);
		al.addEdge(lNode, mNode, 140);
		al.addEdge(mNode, dNode, 140);
		al.addEdge(dNode, cNode, 140);
		al.addEdge(sNode, fNode, 140);
		al.addEdge(fNode, bNode, 140);
		al.addEdge(sNode, rNode, 140);
		al.addEdge(rNode, cNode, 140);
		al.addEdge(rNode, pNode, 140);
		al.addEdge(cNode, pNode, 140);
		al.addEdge(pNode, bNode, 140);
		al.addEdge(bNode, gNode, 140);
		al.addEdge(bNode, uNode, 140);
		al.addEdge(uNode, hNode, 98);
		al.addEdge(hNode, eNode, 86);
		
//		al.bfs(aNode, bNode);
//		al.bfs(bNode, uNode);
		al.bfs(oNode, eNode);
//		al.bfsState(oNode, eNode);

		al.aStar(aNode, bNode);
	}
	
//	@Test
//	public void testAddNode() {
//		assertEquals(g.addNode("first"), true);
//		assertEquals(g.addNode("second"), true);
//		assertEquals(g.addNode("third"), true);
//		assertEquals(g.addNode("first"), false);
//		assertEquals(g.addNode("second"), false);
//		assertEquals(g.addNode("third"), false);
//		assertEquals(g.nodeExists("first"), true);
//		assertEquals(g.nodeExists("second"), true);
//		assertEquals(g.nodeExists("third"), true);
//		assertEquals(g.nodeExists("fourth"), false);
//		System.out.println("testAddNode..");
//		g.printGraph();
//	}
//	
//	@Test
//	public void testRemoveNode() {
////		assertEquals(g.nodeExists("first"), true);
////		assertEquals(g.nodeExists("second"), true);
////		assertEquals(g.nodeExists("third"), true);
//
//		assertEquals(g.addNode("five"), true);
//		assertEquals(g.addNode("six"), true);
//		assertEquals(g.addNode("seven"), true);
//		assertEquals(g.nodeExists("five"), true);
//		assertEquals(g.nodeExists("six"), true);
//		assertEquals(g.nodeExists("seven"), true);
//		assertEquals(g.removeNode("five"), true);
//		assertEquals(g.removeNode("six"), true);
//		assertEquals(g.removeNode("seven"), true);
//		assertEquals(g.nodeExists("five"), false);
//		assertEquals(g.nodeExists("six"), false);
//		assertEquals(g.nodeExists("seven"), false);
//		System.out.println("testRemoveNode..");
//		g.printGraph();
//	}

//	@Test
//	public void testAddNodeRedux() {
//		assertEquals(gr.addNode("first"), true);
//		assertEquals(gr.addNode("second"), true);
//		assertEquals(gr.addNode("third"), true);
//		assertEquals(gr.addNode("first"), false);
//		assertEquals(gr.addNode("second"), false);
//		assertEquals(gr.addNode("third"), false);
//		assertEquals(gr.nodeExists("first"), true);
//		assertEquals(gr.nodeExists("second"), true);
//		assertEquals(gr.nodeExists("third"), true);
//		assertEquals(gr.nodeExists("fourth"), false);
//		gr.printGraph();
//	}
//
//	@Test
//	public void testRemoveNodeRedux() {
//		assertEquals(gr.addNode("five"), true);
//		assertEquals(gr.addNode("six"), true);
//		assertEquals(gr.addNode("seven"), true);
//		assertEquals(gr.nodeExists("five"), true);
//		assertEquals(gr.nodeExists("six"), true);
//		assertEquals(gr.nodeExists("seven"), true);
//		assertEquals(gr.removeNode("five"), true);
//		assertEquals(gr.removeNode("six"), true);
//		assertEquals(gr.removeNode("seven"), true);
//		assertEquals(gr.nodeExists("five"), false);
//		assertEquals(gr.nodeExists("six"), false);
//		assertEquals(gr.nodeExists("seven"), false);
//	}
//	
//	@Test
//	public void testPrintGraph() {
//		System.out.println("testPrintGraph..");
////		g.printGraph();
//		gr.printGraph();
//	}
}
