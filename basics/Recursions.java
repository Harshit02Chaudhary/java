import java.util.*;
// import java.io.*;

public class Recursions {
    public static void main(String[] args){
        //int ans = countzero(2030004);
        Scanner sc = new Scanner(System.in);

        // int n = sc.nextInt();
        // int arr[] = new int[n];
        // for(int i=0; i<n; i++){
        //     arr[i] = sc.nextInt();
        // }
        //int t = sc.nextInt();
        //int ans = bs(arr, t, 0, n);
        //int ans = maxx(arr, 0);
        //fun2(5);
        String s = sc.next();
        String ans = reverse(s);
        //rev(s, 0, s.length()-1);
        System.out.println(ans);
        sc.close();
    }
    //reverse string 
    public static String reverse(String str){
        if(str.isEmpty()){
            String a = "";
            return a;
        }
        char c = str.charAt(0);
        String sAns = reverse(str.substring(1));
        String ans = sAns + c;
        return ans;
    }

    //binary search 
    public static int bs(int[] arr, int t, int s, int e){
        if(s > e){
            return -1;
        }
        int mid = s + (e-s)/2;

        if(arr[mid] > t){
            return bs(arr, t, s, mid-1);
        }
        else if(arr[mid] < t){
            return bs(arr, t, mid+1, e);
        }
        else{
            return mid;
        }
    }
    //maximum element in array
    public static int maxx(int[] arr, int s){
        if(s == arr.length){
            return arr[arr.length-1];
        }
        int m = maxx(arr, s+1);
        if(arr[s] > m){
            return arr[s];
        }else{
            return m;
        }
    }
    //power of a number
    public static int power(int x, int n){
        if(n == 0){
            return 1;
        }
        return x * power(x,n-1);
    }
    //binary conversion
    static void fun2(int n)
    {
    if(n == 0)
        return;
    
    fun2(n/2);
    System.out.print(n%2);
    }
    //count number of zeros
    //way1 taking count as public variable
    static int count = 0;
    public static int zero(int n){
        if(n == 0){
            return 0;
        }
        int rem = n%10;
        if(rem == 0){
            count++;
        }
        zero(n/10);
        return count;
    }  
    //way1 taking count in arguement
    static int countzero(int n){
        return helper(n, 0);
    }
    private static int helper(int n, int c){
        if(n == 0){
            return c;
        }
        int rem = n%10;
        if(rem == 0){
            return helper(n/10, c+1);
        }
        else{
            return helper(n/10, c);
        }

    }
}
