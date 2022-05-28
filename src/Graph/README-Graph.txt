--------------------
Graph Data structure
--------------------
Tree data structure is mostly use for parent-child relationship.
For friend relationship we use Graph data structure.

G = (v,e)
where,
v - no. of vertices
e - no. of edges

Directed vs Undirected Graphs
-----------------------------
In an undirected graph if we write (v1, v2) which means, we can go from v1 to v2
and also we can go from v2 to v1.

Degree of Undirected Graph - No. of edges going through it.


Real life example -
a) A social network


In a Directed graph if we write (v1, v2) which means, we can only go from v1 to v2.
Real life example -
a) World Wide Web

Degree of Directed Graph -
Indegree - No. of edges coming into it.
Outdegree - No. of edges going away from it.

Term related to Graph
---------------------
Walk - When you start from vertex and traverse the Graph but steps on visited Vertex again.
eg - v1, v2, v4, v2

Path - When you never steps on visited vertex.
eg - v1, v2, v4

Cyclic - if there exists a walk which starts and end on same vertex.

Weighted - Here we have weights assigned to edges, it can be directed or undirected.
eg - Connected cities where weight of edges represents distance between cities.
Also, computer networks are good examples for the same.

Graph Representation
--------------------
Graph can be represented in following ways -
(1) Adjacency Matrix -
For undirected graph the adjacency matrix is always symmetric.

(2) Adjacency List -
Adjacency List came into picture because earlier in Matrix we were storing information of vertex which are connected
to each other, but we were also storing info of vertex which were also not connected to each other (which we don't require).

So Adjacency List came into the picture.

Adjacency List most popular representations are -
(A) Dynamic Sized Arrays
(B) Linked Lists

----------------------
BFS Traversal in Graph
----------------------
check the function code

1. BFS is a Graph traversal algorithm, it takes a source and traverse all vertexes which are one edge away,
then traverse which are two edge away.
Advantage is, it finds the shortest path (in an unweighted graph).
2. Crawlers in Search Engine
3. Peer to peer Networks
4. Social network Search
5. In Garbage Collection (Cheney's Algorithm)
6. Cycle detection
7. Ford Fulkerson Algorithm
8. Broadcasting

----------------------
DFS Traversal in Graph
----------------------
DFS is mainly recursive in nature.







