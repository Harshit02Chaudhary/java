import java.io.*;
import java.util.*;

class Pair{
    int val;
    int idx;
    Pair(int val, int idx){
        this.val = val;
        this.idx = idx;
    }
}

public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = input.nextInt();
        }
        Solution s  = new Solution();
        int ans[] = s.stockSpan(a);
        for(int i = 0; i < n; i++){
            System.out.print(ans[i] + " ");
        }
    }
}

class Solution {
    static int[] stockSpan(int[] a) {
        Stack<Integer> st = new Stack<>();
		int n = a.length;
		int arr[] = new int[n];

		for(int i=0; i<n; i++){
			int j = i;
			if(st.size() == 0){
				arr[i] = -1;
			}
			else{
				while(st.size() > 0 && a[st.peek()] <= a[i]){
					st.pop();
				}
				if(st.size() == 0){
					arr[i] = -1;
				}
				else{
					arr[i] = st.peek();
				}
			}
			st.push(i);
		}

		// for(int i=n-1; i>=0; i--) {
		// 	if(st.size() == 0) {
		// 		st.push(i);
		// 	}
		// 	else {
		// 		while(st.size() > 0 && a[st.peek()] < a[i]) {
		// 			int idx = st.pop();
		// 			arr[idx] = i;
		// 		}
		// 		st.push(i);
		// 	}
		// }

		// while(st.size() > 0 ) {
		// 	int idx = st.pop();
		// 	arr[idx] = -1;
		// }

		int[] ngerleft = new int[n];

		for(int i=0; i<n; i++) {
			ngerleft[i] = i - arr[i];
		}
		return ngerleft;
    }
}