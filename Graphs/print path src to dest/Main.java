import java.io.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        ArrayList<ArrayList<Integer>> Edges = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < M; i++) {
            ArrayList<Integer> e = new ArrayList<Integer>();
            e.add(sc.nextInt());
            e.add(sc.nextInt());
            Edges.add(e);
        }
        int U=sc.nextInt();
        int V=sc.nextInt();
        Solution ob = new Solution();
        if (ob.check(N, M, Edges,U,V)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        sc.close();
    }

}

class Solution {
    
    boolean check(int N, int M, ArrayList<ArrayList<Integer>> Edges,int U,int V) {
        // your code here
       ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i=1; i<=N; i++) 
            graph.add(new ArrayList<Integer>());
        
        for(ArrayList<Integer> edge : Edges) {
            int u = edge.get(0)-1;
            int v = edge.get(1)-1;
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        boolean[] visited = new boolean[N];

        return dfs(graph, visited, U-1, V-1);
    }

	public boolean dfs(ArrayList<ArrayList<Integer>> graph, boolean[] visited, int src, int dest) {
        if(src == dest) 
			return true;
		
		visited[src] = true;

        for(int nbr : graph.get(src)) {
            if(!visited[nbr]) {
                if(dfs(graph, visited, nbr, dest))
					return true;
			}
        }
		return false;
    }
}