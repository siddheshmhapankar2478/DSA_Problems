package A10_Graph.A10_Graphs_Concept;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Q3_Graph_Representation {

    class Graph {
        int V; // Number of vertices
        List<List<Integer>> adjacencyList;

        public Graph(int vertices) {
            this.V = vertices;
            this.adjacencyList = new ArrayList<>(V);

            for (int i = 0; i < V; i++) {
                adjacencyList.add(new LinkedList<>());
            }
        }

        public void addEdge(int from, int to) {
            adjacencyList.get(from).add(to);
            adjacencyList.get(to).add(from); // Uncomment this line for an undirected graph
        }
    }
    public static void main(String[] args) {
        Q3_Graph_Representation q3 = new Q3_Graph_Representation();
        Graph graph = q3.new Graph(5);
    }
}
