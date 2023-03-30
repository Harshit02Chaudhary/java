import java.io.*;
import java.util.*;
class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(read.readLine());
        
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        
        for(int i=0; i<N; i++)
        {
            String S[] = read.readLine().split(" ");
            ArrayList<Integer> temp = new ArrayList<>();
            for(int j=0; j<N; j++)
                temp.add(Integer.parseInt(S[j]));
            adj.add(temp);
        }

        Solution ob = new Solution();
        System.out.println(ob.components(adj,N));
    }
}

class Solution {
    int components(ArrayList<ArrayList<Integer>> adj, int N) {
        
       //Your code here
		boolean[] visited = new boolean[N];
        int ans = 0;
        for(int i=0; i<N; i++) {
            if(visited[i]) continue;
			ans++;
			
			Queue<Integer> q = new LinkedList<>();
	        q.add(i);

	        while(q.size() > 0) {
	            int curr = q.remove();
	            if(visited[curr]) continue;
	
	            visited[curr] = true;
	
	            for(int nbr=0; nbr<N; nbr++) {
	                if(nbr == curr) continue;
					
					if(!visited[nbr] && adj.get(curr).get(nbr) == 1)
						q.add(nbr);
	            }
	        }	
			
        }
        return ans;
	}
};