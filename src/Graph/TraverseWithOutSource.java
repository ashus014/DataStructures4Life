package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

// Also known as no. of islands in a graph
public class TraverseWithOutSource {

    public static void main(String[] args) {

        int V = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(V);

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<Integer>());
        }

        addEdge(adj, 0, 1);
        addEdge(adj, 0, 2);
        addEdge(adj, 1, 2);
        addEdge(adj, 1, 3);
        addEdge(adj, 2, 3);
        addEdge(adj, 2, 4);
        addEdge(adj, 3, 4);

//        printGraph(adj);
    }

    static void BFS(ArrayList<ArrayList<Integer>> adj, int s, boolean[] visited ) {

        Queue<Integer> q = new LinkedList<>();
        visited[s] = true;
        q.add(s);
        while (!q.isEmpty()) {
            int u = q.poll();
            System.out.print(u + " ");
            for(int v : adj.get(u)) {
                if(visited[v] == false) {
                    visited[v] = true;
                    q.add(v);
                }
            }
        }
    }

    static void BFSDist(ArrayList<ArrayList<Integer>> adj, int v) {

        boolean[] visited = new boolean[v + 1];
        for (int i = 0; i < v; i++) {
            if (visited[i] == false) {
                BFS(adj, i, visited);
            }
        }
    }

    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    static void printGraph(ArrayList<ArrayList<Integer>> adj) {

        for (int i = 0; i < adj.size(); i++) {
            for (int j = 0; j < adj.get(i).size(); j++) {
                System.out.print(adj.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
