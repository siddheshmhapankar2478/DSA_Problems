package A10_Graph.A10_Graphs_Concept;

import java.util.ArrayList;

public class Q2_DFS_Traversal {

    boolean[] visited;
    ArrayList<Integer> ans = new ArrayList<>();

    public void dfs(int node, ArrayList<ArrayList<Integer>> adj) {
        visited[node] = true;
        ans.add(node);
        for (Integer neighbor : adj.get(node)) {
            if (visited[neighbor] != true) {
                dfs(neighbor, adj);
            }
        }
    }

    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        visited = new boolean[V];
        dfs(0, adj);
        return ans;
    }

    public static void main(String[] args) {

    }
}
