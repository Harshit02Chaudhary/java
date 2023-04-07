package Arrays;

import java.util.Scanner;

public class CountingInversions {
    public static void main(String[] args){
		try (Scanner sc = new Scanner(System.in)) {
			int t=sc.nextInt();
			while(t>0){
				int n=sc.nextInt();
				long []A=new long[n];
				for(int i=0;i<n;i++){
					A[i]=sc.nextLong();
				}
				//Solution ob =new Solution();
				long ans = getInversions(A,n);
                System.out.print(ans);
                System.out.println();
				t--;
			}
		}
	}
    public static long getInversions(long arr[], int n) {
        return mergeSort(arr, 0, n-1);
    }
    public static long mergeSort(long[] arr, int low, int high) {
        int count = 0;
        if(low < high) {
            int mid = low + (high-low)/2;
            count += mergeSort(arr, low, mid);
            count += mergeSort(arr, mid+1, high);
            count += merge(arr, low, mid, high);
        }
        return count;
    }

    public static long merge(long[] arr, int low, int mid, int high) {
        int left = low;
        int right = mid+1;
        int p = 0;
        long count = 0;
        long[] temp = new long[high-low+1];

        while(left <= mid && right <= high) {
            if(arr[left] <= arr[right]) {
                temp[p++] = arr[left++];
            }
            else {
                temp[p++] = arr[right++];
                count += mid+1-left;
            }
        }

        while(left <= mid) {
            temp[p++] = arr[left++];
        }

        while(right <= high) {
            temp[p++] = arr[right++];
        }

        for(int i=low; i<=high; i++) {
            arr[i] = temp[i-low];
        }

        return count;
    }
}
