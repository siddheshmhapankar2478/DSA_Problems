package A10_Graph.A10_Graphs_Concept;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Q1_BFS_Traversal {
    ArrayList<Integer> ans = new ArrayList<>();
    Queue<Integer> q = new LinkedList<>();
    boolean[] visited;
    public void bfs(int V, ArrayList<ArrayList<Integer>> adj) {
        q.offer(V);
        visited[V] = true;
        while (!q.isEmpty()) {
            Integer node = q.poll();
            ans.add(node);
            for (Integer neighbor : adj.get(node)) {
                if (visited[neighbor] != true) {
                    visited[neighbor] = true;
                    q.offer(neighbor);
                }
            }
        }
    }
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        visited = new boolean[V];
        bfs(0, adj);
        return ans;
    }

    public static void main(String[] args) {

    }
}
