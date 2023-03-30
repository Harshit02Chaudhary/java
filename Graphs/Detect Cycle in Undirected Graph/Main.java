import java.util.*;

//Normal bfs traversal in undirected graph if node is added in the queue by to vertices...it is a cycle

class Solution {
    public static boolean isCycle(int V, ArrayList<ArrayList<Integer>> graph) {
        // Your code here
        boolean[] visited = new boolean[V];
        
        for(int i=0; i<V; i++) {
            if(visited[i]) continue;
            if(bfs(graph, visited)) return true;
        }
        return false;
    }
    static boolean bfs(ArrayList<ArrayList<Integer>> graph, boolean[] visited) {
        Queue<Integer> q = new LinkedList<>();
        q.add(0);

        while(q.size() > 0) {
            int curr = q.remove();
            if(visited[curr]) return true;

            visited[curr] = true;

            for(int nbr : graph.get(curr)) {
                if(!visited[nbr]) q.add(nbr);
            }
        }

        return false;
    }
}

public class Main{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int N, E;
        N = sc.nextInt();
        E = sc.nextInt();
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i =0; i<N; i++) adj.add(i, new ArrayList<Integer>());    
        for(int i =0; i<E; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        boolean ans = Solution.isCycle(N,adj);
        if(ans)
            System.out.println("1");
        else
            System.out.println("0");
        
        sc.close();
    }
}