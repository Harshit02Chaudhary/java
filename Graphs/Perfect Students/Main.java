import java.io.*;
import java.util.*;
  class Edge {
      int src;
      int nbr;

      Edge(int src, int nbr) {
         this.src = src;
         this.nbr = nbr;
      }
   }
class Solution{
    public static int perfectStudents(int vtces,  ArrayList<Edge>[] Edges){
        // Build Graph
        boolean[] visited = new boolean[vtces];
        ArrayList<ArrayList<Integer>> components = new ArrayList<>();

        for(int i=0; i<vtces; i++) {
            if(visited[i]) continue;
            ArrayList<Integer> comps = new ArrayList<>();
            getComponents(Edges, comps, i, visited);
            components.add(comps);
        }

        int totalDiffPair = 0;
        for(int i=0; i<components.size(); i++) {
            for(int j=i+1; j<components.size(); j++) {
                totalDiffPair += components.get(i).size() * components.get(j).size();
            }
        }
        return totalDiffPair;
    }
    public static void getComponents(ArrayList<Edge>[] graph, ArrayList<Integer> comps, int src, boolean[] visited) { 
        if(visited[src]) return;
        visited[src] = true;
        comps.add(src);

        for(Edge e : graph[src]) {
            if(visited[e.nbr]) continue;
            getComponents(graph, comps, e.nbr, visited);
        }
    }
}
public class Main {
   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int n = Integer.parseInt(br.readLine());
      int k = Integer.parseInt(br.readLine());

      int vtces = n;
      ArrayList<Edge>[] graph = new ArrayList[vtces];
      for (int i = 0; i < vtces; i++) {
         graph[i] = new ArrayList<>();
      }

      int edges = k;
      for (int i = 0; i < edges; i++) {
         String[] parts = br.readLine().split(" ");
         int v1 = Integer.parseInt(parts[0]);
         int v2 = Integer.parseInt(parts[1]);
         graph[v1].add(new Edge(v1, v2));
         graph[v2].add(new Edge(v2, v1));
      }
      System.out.println(Solution.perfectStudents(n, graph));
   }

}