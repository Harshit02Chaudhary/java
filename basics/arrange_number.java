import java.util.Scanner;

public class arrange_number {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
       // int i = 0;
        int len = arr.length;
       // int k = 1;
    //     if(len%2 == 0){
    //     while(i < len/2){
	// 		arr[i] = k;
    //         System.out.print(arr[i] + " ");
    //         k = k+2;
    //         i++;
    //     }
    //     k--;
    // }
    //     else{
    //         while(i <= len/2){
	// 		arr[i] = k;
    //         System.out.print(arr[i] + " ");
    //         k = k+2;
    //         i++;
    //     }
    //     k = k-3;
    //     }

    // for(i = 0; i<=(len-1)/2; i++){
    //     arr[i] = k;
    //     System.out.print(arr[i] + " ");
    //     k = k+2;
    // }
    // if(len%2 == 0){
    //     k--;
    // }
    // else{
    //     k = k-3;
    // }
    //     while(i<len){
    //         arr[i] = k;
    //         System.out.print(arr[i] + " ");
    //         k = k-2;
    //         i++;
    //     }

    int val = 1;
    int st = 0, e = n-1;
    
    for(int i=0; i<=(len-1)/2; i++){
        arr[st] = val;
        st++;
        val++;
        if(len%2==1 && i == (len-1)/2){
            break;
        }
        arr[e] = val;
        val++;
        e--;
    }

    for(int i = 0; i<len; i++){
        System.out.print(arr[i] + " ");
        }
        s.close();
    }

    int ans = 0;
    for(int i=0; i<n; i++){
        int count = 0;
        while(arr[i] == arr[i+1]){
            count++;
            i++;
        }
        ans = Math.max(ans, count);
    }
}
