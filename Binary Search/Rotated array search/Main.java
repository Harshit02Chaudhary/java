import java.util.*;

class Main {
  public static void main (String[] args)
	{
    Scanner sc = new Scanner(System.in);
	    
	  int N = sc.nextInt();
	  int[] A = new int[N];
	  for(int i=0;i<N;i++){
          A[i] = sc.nextInt();
      }
	  int B = sc.nextInt();
	  Solution ob = new Solution();
    System.out.println(ob.search(A,B));
    sc.close();
		
	}
}
// 8
// 4 5 6 7 0 1 2 3
// 4
class Solution{
    public int search(final int[] a, int target) {
        //Write code here
		int low = 0, high = a.length-1;

        while(low <= high) {
            int mid = low + (high-low)/2;

            if(a[mid] == target) {
                return mid;
            }
            else if(a[low] <= a[mid]) {
                if(target < a[mid] && target >= a[low]) {
                    high = mid-1;
                }
                else {
                    low = mid+1;
                }
            }
            else {
                if(target > a[mid] && target <= a[high]) {
                    low = mid+1;
                }
                else {
                    high = mid-1;
                }
            }  
        }
        return -1;
    }
}