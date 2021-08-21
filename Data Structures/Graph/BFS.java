import java.util.*;

class Graph {
    int V;
    LinkedList<Integer> adj[];

    Graph(int v) {
        V = v;
        adj = new LinkedList[V];
        for (int i = 0; i < V; i++)
            adj[i] = new LinkedList<>();
    }
    
    void addEdge(int v,int w)
    {
        adj[v].add(w);
    }

    void bfs(int s) {
        boolean vis[] = new boolean[V];
        Queue<Integer> queue = new LinkedList<Integer>();

        vis[s] = true;
        queue.add(s);

        while (!queue.isEmpty()) {
            s = queue.poll();
            System.out.println(s);

            Iterator<Integer> i = adj[s].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!vis[n]) {
                    vis[n] = true;
                    queue.add(n);
                }
            }
        }
    }
}

class RightVibe {
    public static void main(String args[]) {
        System.out.println("=========================================================\n");

        int V = 5;
        Graph graph = new Graph(V);
        
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(2, 3);
        graph.addEdge(3, 3);

        graph.bfs(2);

        System.out.println("\n");
    }
}
