import java.util.*;

class Solution {
    public int peakIndexInMountainArray(int[] a) {
       // Your code here.
		int l = 0, h = a.length-1;
	
		while(l <= h) {
			int mid = l + (h-l)/2;

			if(mid == 0) {
				if(a[mid] > a[mid+1]) {
                    return mid;
				}else {
                    l = mid+1;
                }
			}
            else if(mid == a.length-1) {
                if(a[mid] > a[mid-1]) {
                    return mid;
                }else {
                    h = mid-1;
                }
            }
            else {
                if(a[mid] > a[mid-1] && a[mid] > a[mid+1]) {
                    return mid;
                }
                else if(a[mid] >= a[mid-1]) {
                    l = mid+1;
                }
                else {
                    h = mid-1;
                }
            }
		}
        return -1;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int arr1[] = new int[n];
        for(int i=0;i<n;i++)
            arr1[i] = sc.nextInt();
        Solution Obj = new Solution();
        int result = Obj.peakIndexInMountainArray(arr1);
        System.out.print(result + " ");
        System.out.println('\n');
    }
}