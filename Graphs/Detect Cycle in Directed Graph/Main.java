import java.util.*;

class Solution {
    public boolean isCyclic(int V, ArrayList<Integer>[] adj) {
        // Your code here
        boolean[] path = new boolean[V];
        boolean[] visited = new boolean[V];

        for(int i=0; i<V; i++) {
            if(visited[i]) continue;

            if(dfs(adj, path, visited, i))
                return true;
        }
        return false;
    }

    public boolean dfs(ArrayList<Integer>[] graph, boolean[] path, boolean[] visited, int curr) {

        visited[curr] = true;
        path[curr] = true;

        for(int nbr : graph[curr]) {
            if(path[curr] && visited[curr]) 
                return true;

            if(!visited[curr]) {
                boolean cycle = dfs(graph, path, visited, nbr);
                if(cycle) return true;
            }
        } 
        
        return false;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int V, E;
        V = sc.nextInt();
        E = sc.nextInt();
        ArrayList<Integer>[] adj = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            adj[i] = new ArrayList<Integer>();
        }
        for (int i = 0; i < E; i++) {
            int u, v;
            u = sc.nextInt();
            v = sc.nextInt();
            adj[u].add(v);
        }
        Solution obj = new Solution();
        boolean ans = obj.isCyclic(V, adj);
        if (ans == true) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        sc.close();
    }
}