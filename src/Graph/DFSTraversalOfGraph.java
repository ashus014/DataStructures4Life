package Graph;

import java.util.ArrayList;

public class DFSTraversalOfGraph {

    public static void main(String[] args) {

        int V=5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(V);

        for(int i=0; i<V; i++){
            adj.add(new ArrayList<Integer>());
        }

        addEdge(adj,0,1);
        addEdge(adj,0,2);

        addEdge(adj,3,1);
        addEdge(adj,3,2);

        addEdge(adj,4,1);
        addEdge(adj,4,3);

        DFS(adj, 5, 1);
    }

    // V = total vertex
    // s = source
    static void DFS(ArrayList<ArrayList<Integer>> adj, int V, int s) {

        boolean[] visited = new boolean[V];
        for(int i=0; i<V; i++) {
            visited[i] = false;
        }
        DFSRec(adj, s, visited);
    }

    static void DFSRec(ArrayList<ArrayList<Integer>> adj, int s, boolean[] visited) {
        visited[s] = true;
        System.out.print(s + " ");
        for(int u : adj.get(s)) {
            if(visited[u] == false) {
                DFSRec(adj, u, visited);
            }
        }
    }

    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
}
