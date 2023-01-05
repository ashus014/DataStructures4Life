package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

// Using Khan's Algorithm to detect cycle
// For a cycle to be present, (count < no. of vertexes) in a graph.
public class DetectCycleInUnDirectedGraph {

    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v)
    {
        adj.get(u).add(v);
    }

    static void topologicalSort(ArrayList<ArrayList<Integer>> adj, int V)
    {
        int[] in_degree = new int[V];

        for (int u = 0; u < V; u++) {
            for (int x:adj.get(u))
                in_degree[x]++;
        }

        Queue<Integer> q=new LinkedList<>();
        for (int i = 0; i < V; i++)
            if (in_degree[i] == 0)
                q.add(i);

        int count=0;
        while (q.isEmpty()==false) {
            int u = q.poll();


            for (int x: adj.get(u))
                if (--in_degree[x] == 0)
                    q.add(x);

            count++;
        }
        if (count != V) {
            System.out.println("There exists a cycle in the graph");
        }
        else{
            System.out.println("There exists no cycle in the graph");
        }
    }

    public static void main(String[] args)
    {
        int V = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(V);

        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<Integer>());

        addEdge(adj,0, 1);
        addEdge(adj,4, 1);
        addEdge(adj,1, 2);
        addEdge(adj,2, 3);
        addEdge(adj,3, 1);

        topologicalSort(adj,V);
    }
}
