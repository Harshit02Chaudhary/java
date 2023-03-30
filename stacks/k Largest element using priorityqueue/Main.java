import java.util.*;

class Solution{
    static int[] SlidingWindowMaximum(int N, int K, int[] arr){
        // write code here
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i=0; i<N; i++) {

            if(i < K) {
                pq.add(arr[i]);
            }
            else{
                if(pq.peek() < arr[i]) {
                    pq.poll();
                    pq.add(arr[i]);
                }
            }

        }

        ArrayList<Integer> ans = new ArrayList<>(pq);
        Collections.sort(ans, Collections.reverseOrder());

        int[] array = new int[ans.size()];
        int i = 0;

        for(int val : ans) {
            array[i] = val;
            i++;
        }
        
        return array;
    }
}

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int nums[]=new int[n];
        for(int i = 0; i < n; i++)
        {
            nums[i] = sc.nextInt();
        }
        Solution obj = new Solution();
        int[] ans=obj.SlidingWindowMaximum(n,k,nums);
        for(int i=0;i<ans.length;++i){
            System.out.print(ans[i] + " ");
        }
    }
}
