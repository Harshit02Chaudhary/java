import java.io.*;
import java.util.*;
 
 class Solution
{
        static int solve(int N, int[] Arr, int K){
        // Write your code here
        HashMap<Integer, Integer> prevsum = new HashMap<>();
        int result = 0;
        prevsum.put(0,1);

        int currsum = 0;
        for(int i=0; i<N; i++) {
            
            currsum += Arr[i];
            
            int removevalue = currsum - k;
            if(prevsum.containsKey(removevalue)) {
                result += prevsum.get(removevalue);
            }

            prevsum.put(currsum, prevsum.getOrDefault(currsum, 0) + 1);
        }
        return result;
    }
}
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
         int N = Integer.parseInt(br.readLine().trim());
         String[] arr_Arr = br.readLine().split(" ");
         int[] Arr = new int[N];
         for(int i_Arr = 0; i_Arr < arr_Arr.length; i_Arr++)
         {
         	Arr[i_Arr] = Integer.parseInt(arr_Arr[i_Arr]);
         }
         int K = Integer.parseInt(br.readLine().trim());

		 //Solution obj = new Solution();
         int out_ = obj.solve(N, Arr, K);
         System.out.println(out_);
 
         wr.close();
         br.close();
    }
}