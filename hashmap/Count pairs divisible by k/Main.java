//import java.io.*;
import java.util.*;

class Solution {
    public boolean arrayPairs(int[] arr, int k) {
		// write code here
		HashMap<Integer, Integer> map = new HashMap<>();
		
        for(int i=0; i<arr.length; i++) {
            int rem = arr[i] % k;

            map.put(rem, map.getOrDefault(map, 0) + 1);
        }

        for(int key : map.keySet()) {
            int c_key = k-key;

            if(key == 0) {
                continue;
            }
            if(map.containsKey(c_key) == false) 
                return false;
            else if(map.get(key) != map.get(c_key)) 
                return false;
        }
        return true;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,k;
        n = sc.nextInt();
		k = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        Solution Obj = new Solution();
        if(Obj.arrayPairs(arr,k)){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
        sc.close();
    }
}