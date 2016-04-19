
import static org.junit.Assert.*;

import org.junit.Test;

public class TestGraph {

//	AdjacencyMatrix<Node<E>> g = new AdjacencyMatrix<>();
//	AdjacencyMatrixSimple<String> g = new AdjacencyMatrixSimple<>(10);

//	GraphAgain<String> g = new GraphAgain<>();
	GraphAgainRedux<String> gr = new GraphAgainRedux<>();

	
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

	@Test
	public void testAddNodeRedux() {
		assertEquals(gr.addNode("first"), true);
		assertEquals(gr.addNode("second"), true);
		assertEquals(gr.addNode("third"), true);
		assertEquals(gr.addNode("first"), false);
		assertEquals(gr.addNode("second"), false);
		assertEquals(gr.addNode("third"), false);
		assertEquals(gr.nodeExists("first"), true);
		assertEquals(gr.nodeExists("second"), true);
		assertEquals(gr.nodeExists("third"), true);
		assertEquals(gr.nodeExists("fourth"), false);
		gr.printGraph();
	}

	@Test
	public void testRemoveNodeRedux() {
		assertEquals(gr.addNode("five"), true);
		assertEquals(gr.addNode("six"), true);
		assertEquals(gr.addNode("seven"), true);
		assertEquals(gr.nodeExists("five"), true);
		assertEquals(gr.nodeExists("six"), true);
		assertEquals(gr.nodeExists("seven"), true);
		assertEquals(gr.removeNode("five"), true);
		assertEquals(gr.removeNode("six"), true);
		assertEquals(gr.removeNode("seven"), true);
		assertEquals(gr.nodeExists("five"), false);
		assertEquals(gr.nodeExists("six"), false);
		assertEquals(gr.nodeExists("seven"), false);
	}
	
	@Test
	public void testPrintGraph() {
		System.out.println("testPrintGraph..");
//		g.printGraph();
		gr.printGraph();
	}
}
