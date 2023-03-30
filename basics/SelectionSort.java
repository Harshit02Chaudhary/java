import java.util.*;
public class SelectionSort {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int arr[] = new int [n];

        for(int i = 0; i<n; i++){
            arr[i] = s.nextInt();
        }

        //bub(arr, n-1, 0);
        sort(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));

        //selection sort algo
        // for(int i=0; i<n; i++){
        //     int temp = 0;
        //     for(int j=0; j<=n-i-1; j++){
        //         if(arr[j] > arr[temp]){
        //             temp = j;
        //         }
        //     }
        //     int c = arr[n-i-1];
        //     arr[n-i-1] = arr[temp];
        //     arr[temp] = c;
        // }
        // for(int i = 0; i<n; i++){
        //     System.out.print(arr[i] + " ");
        s.close();
        }
    
    //bubble sort using recursion
    public static void bub(int[] arr, int r, int c){
        if(r == 0){
            return;
        }
        if(r > c){
            if(arr[c] > arr[r]){
                int temp = arr[r];
                arr[r] = arr[c];
                arr[c] = temp;
            }
            bub(arr, r, c+1);
        }else{
            bub(arr, r-1, 0);
        }
    }
    //selection sort using recursion
    public static void sort(int[] arr, int e, int s, int m){
        if(e == 0){
            return;
        }
        //traverse through an array and find maximum number
        if(e > s){
            if(arr[m] > arr[s]){
                sort(arr, e, s+1, m);
            }else{
                sort(arr, e, s+1, s);
            }
            
        }
        else{
        //swap max with last index
            int temp = arr[e-1];
            arr[e-1] = arr[m];
            arr[m] = temp; 
        //recursion call for next maximum number
            sort(arr, e-1, 0, 0);
        }
    
    }
}
