import java.util.*;

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int ans = Solution.findEquilibriumIndex(a);
        System.out.println(ans);
        sc.close();
    }
}

class Solution {
    static int findEquilibriumIndex(int[] a) {
        //Write code here
        int TotalSum = 0;
        //find total sum
        for(int i=0; i<a.length; i++) {
            TotalSum += a[i];
        }

        //now find LeftSum by adding elements till "i" 
        //and RightSum using TotalSum
        int LeftSum = 0;
        for(int i=0; i<a.length; i++) {

            LeftSum += a[i];
            int RightSum = TotalSum - LeftSum + a[i];

            if(LeftSum == RightSum) {
                return i;
            }
        }
        return -1;
    }
}