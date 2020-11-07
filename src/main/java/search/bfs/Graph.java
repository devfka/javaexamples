package search.bfs;

import java.util.LinkedList;

public class Graph {

    private int V; // no of vertices
    private LinkedList<Integer> adj[]; //Adjacency List

    Graph(int v) {
        this.V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    // Function to add an edge into the graph
    void addEdge(int v, int w) {
        adj[v].add(w);
    }

}
