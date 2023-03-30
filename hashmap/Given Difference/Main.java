//import java.io.*;
import java.util.*;

class Solution {
    public int givenDifference(int []A, int n, int B) {
        // write your code here
		HashSet<Integer> ans = new HashSet<>();

        for(int x : A) {
            if(ans.contains(x+B) || ans.contains(x-B)) {
                return 1;
            }
            ans.add(x);
        }
        return 0;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,B;
        n = sc.nextInt();
        int []mat=new int[n];
        for(int i=0;i<n;++i){
            mat[i]=sc.nextInt();
        }
        B = sc.nextInt();
        Solution Obj = new Solution();
        System.out.println(Obj.givenDifference(mat,n,B));
        System.out.println('\n');
        sc.close();
    }
}
