import java.io.*;
import java.util.*;

class Solution {
    public int findElement(int[] arr, int n) {
        // Write your code here
		int[] leftmax = new int[n];
        leftmax[0] = Integer.MIN_VALUE;
        for(int i=1; i<n; i++) {
            leftmax[i] = Math.max(arr[i-1],leftmax[i-1]);
        }
        int rightmin = Integer.MAX_VALUE;
        for(int i=n-1; i>=0; i--) {

            if(leftmax[i] < arr[i] && rightmin > arr[i]) {
                return i;
            }
            rightmin = Math.min(rightmin, arr[i]);
        }
        return -1;
    }
}

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}

        Solution Obj = new Solution(); 
		System.out.println(Obj.findElement(nums, n));
        sc.close();
	}
}