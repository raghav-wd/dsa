import java.util.*;

class Graph {
    int V;
    LinkedList<Integer> adj[];

    Graph(int v) {
        this.V = v;
        adj = new LinkedList[V];
        for (int i = 0; i < V; i++)
            adj[i] = new LinkedList<>();
    }
    
    void addEdge(int v, int w) {
        adj[v].add(w);
    }
    
    void print() {
        for (int v = 0; v < V; v++) {
            System.out.println("\nVertices - " + v);
            Iterator<Integer> itr = adj[v].iterator();
            while (itr.hasNext()) {
                int n = itr.next();
                System.out.print(n + " ");
            }
        }
    }

    void dfsUtil(int v, boolean vis[]) {
        vis[v] = true;
        System.out.print(v + " ");
        Iterator<Integer> itr = adj[v].listIterator();
        while (itr.hasNext()) {
            int n = itr.next();
            if(!vis[n])
                dfsUtil(n, vis);
        }
    }

    void dfs(int v) {
        boolean vis[] = new boolean[V];
        dfsUtil(v, vis);
    }
}

class RightVibe {
    public static void main(String args[]) {
        System.out.println("=========================================================\n");

        Graph graph = new Graph(3);
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(2, 1);
        // graph.print();
        graph.dfs(2);
        
        System.out.println();
    }
}
