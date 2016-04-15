
import static org.junit.Assert.*;

import org.junit.Test;

public class TestGraph {

	AdjacencyMatrix<> g = new AdjacencyMatrix<>(4);
	
	@Test
	public void test() {
		assert(g.getNumEdges() == 0);
		assert(g.getNumVerices() == 0);
//		fail("Not yet implemented");
	}

}
