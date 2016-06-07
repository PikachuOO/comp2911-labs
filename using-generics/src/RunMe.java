
public class RunMe {

	public static void main(String args[]) {
		Node<String> one = new Node<String>("hello");
		Node<String> two = new Node<String>("world");
		
//		System.out.println(one.toString());
//		System.out.println(two.toString());
		
//		Edge<Node<String>> edgeOne = new Edge<>(one, two, 50);
//		System.out.println(edgeOne.toString());
		
		
		// Using Graph
		UseGraph<String> graph = new UseGraph<String>();
		graph.addNode(one);
		graph.addNode(two);
		Node<String> three = graph.addNode("hey again");
		graph.printGraph();
		
		graph.addEdge(one, two, 34);
	}
}
