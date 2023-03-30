//import java.io.*;
import java.util.*;
class Main{
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
        int n,q;
        n=sc.nextInt();
        q=sc.nextInt();
        int[] a= new int[n];
        for(int i=0;i<n;i++){
          a[i] = sc.nextInt();
        }
        Solution obj=new Solution();
        System.out.println(obj.minSubarray(a,n,q));		
        sc.close();    
    }
}

class Solution
{
  public int minSubarray(int[] nums,int n, int p) {
      //Write code here
      long totalsum = 0;
      for(int i=0; i<nums.length; i++) {
          totalsum += nums[i];
      }
      if(totalsum%p == 0) return 0;
      int rem = (int) totalsum%p;

      HashMap<Integer, Integer> map = new HashMap<>();
  map.put(0, -1);
      long sum = 0;
      int ans = nums.length;
      for(int i=0; i<nums.length; i++) {
          sum += nums[i];
    sum = sum%p;
          int r = (int) sum%p;
          int search = r - rem;
          if(search < 0) search += p;
          
          if(map.containsKey(search)) {
              ans = Math.min(ans, i - map.get(search));
          }
          map.put(r, i);
      }

     if(ans == nums.length) return -1;
     return ans;
  }
}