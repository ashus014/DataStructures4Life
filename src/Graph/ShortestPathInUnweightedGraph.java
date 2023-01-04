package Graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

// We have to find distance form source node to all other node in a Graph
public class ShortestPathInUnweightedGraph {

    public static void main(String[] args) {
        int V=5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(V);
        for(int i=0; i<V; i++){
            adj.add(new ArrayList<Integer>());
        }
        addEdge(adj,0,1);
        addEdge(adj,0,2);
        addEdge(adj,1,2);
        addEdge(adj,1,3);
        addEdge(adj,2,3);

        System.out.println(Arrays.toString(ShortestPathFromSource(adj, adj.size()-1, 0)));;
    }

    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v){
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    //doing BFS Traversal
    static Integer[] ShortestPathFromSource(ArrayList<ArrayList<Integer>> adj, int V, int s){
        boolean[] visited = new boolean[V+1];
        Integer[] distance = new Integer[V];
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[s] = 0;

        Queue<Integer> q = new LinkedList<>();
        visited[s] = true;
        q.add(s);
        while (q.isEmpty() == false){
            int u = q.poll();
            System.out.println(u + " ");
            for(int v : adj.get(u)){
                if(visited[v] == false){
                    distance[v] = distance[u] + 1;
                    visited[v] = true;
                    q.add(v);
                }
            }
        }
        return distance;
    }

}
