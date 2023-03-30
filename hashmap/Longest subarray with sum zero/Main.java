import java.util.HashMap;
//import java.io.*;
import java.util.*;

class Solution {
   public int maxLen(int arr[])
	{
		// Write your code here
		HashMap<Integer, Integer> map = new HashMap<>();
		int ans = 0, sum = 0;

		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
			if(sum == 0) {
                ans = i+1;
            }
            else if(map.containsKey(sum)) {
                int len = i - map.get(sum);
                ans = Math.max(ans, len);
            }
            else {
                map.put(sum, i);
            }
            
		}
        return ans;
	}
}

class Main {
	
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for (int i = 0; i < n; i++)
		{
			nums[i] = sc.nextInt();
		}
        Solution Obj = new Solution();
		System.out.println(Obj.maxLen(nums));
        sc.close();
	}
}
