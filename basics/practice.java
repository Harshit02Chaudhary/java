// import java.util.Arrays;
 import java.util.Scanner;
// import java.lang.Math;


public class practice {
    public static void main(String[] args){
       
        //  Scanner s = new Scanner(System.in);
        //  int n =  s.nextInt();

        // int i = 0, j = 1, sum ;
        // int m = 2;
        // if(n==1){
        //     System.out.print(1);
        // }
        // while(m<=n){
        //     sum = i+j;
        //     i = j;
        //     j = sum;
        //     if(m==n){
        //        System.out.println(sum); 
        //     }
        //     m++;
        // }
        
    //     int i = 2;
    //    while(i<n){
    //     int j = 2;
    //     if(i==2){
    //         System.out.println(i);
    //         i++;
    //         continue;
    //     }
    //     while(j<i){
    //         if(i%j == 0){
    //             break;
    //             }
    //         if(j==i-1){
    //             System.out.println(i);
    //             }
    //         j++;
    //         }
    //     i++;
    //     }
        // 
        
        // int i = 1;
        
        // while(i<=n){
        //     int temp = 3*i+2;
        //     if(temp%4==0){
        //         i++;
        //         n++;
        //         continue;
        //     }
        //     else{
        //         System.out.print(temp + " ");
                
        //         i++;
        //     }
            
        
        // int rev = 0, rem;
        // while(n>0){
        //     rem = n%10;
        //         rev = 10*rev + rem;
        //         n = n/10;
        // }
        // System.out.println(rev);
        
    //binary to decimal
        // int i = 1, ans =0;
        // int rem;
        // while(n>0){
        //     rem = n%10;
        //     ans = ans+(rem * i);
        //     i *= 2;
        //     n = n/10;
        // }
        // System.out.println(ans);

    //decimal to binary
        // int rem, ans = 0, j = 1;
        // while(n>0){
        //     rem = n%2;
        //     ans = ans + (rem*j);
        //     j = j*10;
        //     n = n/2;
        // }
        // System.out.println(ans);

        // int i = 1, temp = 1,root;
        // while(i<=n/2){
        //     root = temp*temp;
        //     if(root>n){
        //         break;
        //     }
        //     temp++;
        //     i++;
        // }
        // System.out.println(--temp);

        // Scanner s = new Scanner(System.in);
        // int n =  s.nextInt();
        // int arr[] = new int[n];

        // for(int i=0; i<n; i++){
        //     arr[i] = s.nextInt();
        // }
        // int count = 0;
        // for(int i=0; i<n; i++){
        //     for(int j=i+1; j<n; j++){
        //         if(arr[i] > arr[j] && i<j){
        //             count++;
        //         }
        //     }
        // }

        // System.out.println(count);

        // Scanner s = new Scanner(System.in);
        // int n = s.nextInt();
        // int m = s.nextInt();
        // int arr[][] = new int[n][m];
        
        // for(int i=0; i<n; i++){
        //     for(int j=0; j<m; j++){
        //         arr[i][j] = s.nextInt();
        //     }
        // }
        // int ans = 0;
        // boolean flag = false;
        // for(int i=0; i<n; i++){
        //     for(int j=0; j<m; j++){
        //         if(arr[i][j]%2 == 0){
        //             flag = true;
        //             }
        //         }
        //         if(flag == true){
        //             ans++;
        //             break;
        //         }
        //     }
        //     System.out.print(ans);

        //Scanner s = new Scanner(System.in);
        
        //integer input
        // int var = s.nextInt();
        
        //character input
        // String str = s.next();

        // char ch = s.next().charAt(0);

        // System.out.println(ch);

//maximum number of consecutive ones

        // int n = s.nextInt();
        // int arr[] = new int[n];

        // for(int i=0; i<n; i++){
        //     arr[i] = s.nextInt();
        // }
        
        // int count = 0, ans = 0;

        // for(int i=0; i<n; i++){

        //     if(arr[i] == 1){
        //         count++;
        //     }
        //     if(arr[i] == 0){
        //         count = 0;
        //     }
        //     ans = Math.max(count, ans);

        // }
        // System.out.print(ans);

//inser element at its right position 

        // Scanner s = new Scanner(System.in);
        // int n =  s.nextInt();
        // int arr[] = new int[n];

        // for(int i=0; i<n; i++){
        //     arr[i] = s.nextInt();
        // }

        // for(int i=0; i<n; i++){

        //     for(int j=n; j>=0; j--){

                
        //     }
        // }
        // int j = n-2;
        // int u = arr[j+1];
        // while(arr[j] > u){
        //     arr[j+1] = arr[j];
        //     j--;
        //     System.out.println(Arrays.toString(arr));   
        // }
        // arr[j+1] = u;
        // System.out.println(Arrays.toString(arr));

//count shifts to sort the array

        // Scanner s = new Scanner(System.in);
        // int n =  s.nextInt();
        // int arr[] = new int[n];

        // for(int i=0; i<n; i++){
        //     arr[i] = s.nextInt();
        // }

        // int count = 0;
        // for(int i=1; i<n; i++){
        //     int temp = arr[i];
        //     int j = i-1;
        //     while(j >= 0 && temp < arr[j]){
        //         arr[j+1] = arr[j];
        //         j--;
        //         count++;
        //     }
        //     arr[j+1] = temp;
        // }
        // System.out.println(count);
        //System.out.println(Arrays.toString(arr));

//maximun subarray sum of size k

        Scanner s = new Scanner(System.in);
        
        // while(s.hasNextInt()){
        //     int n =  s.nextInt();
        //     System.out.println(n + " ");
        // }

        // int k = s.nextInt();
        // int arr[] = new int[n];

        // for(int i=0; i<n; i++){
        //     arr[i] = s.nextInt();
        // }

        // int max = 0;
        // for(int i=0; i<n; i++){
        //     int sum = 0;
        //     for(int j=i+1; j<n; j++){
        //         sum += arr[j];
        //         if(j-i == k && sum > max){
        //             max = sum;
        //         }
        //     }
        // }
        // System.out.println(max);

        // int n = s.nextInt();
        // int t = n;
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=n-i; j++){
        //         System.out.print(" ");
        //     }
        //     for(int k=1; k<=i; k++){
        //         System.out.print(t);
        //     }
        //     t--;
        //     System.out.println();
        // }
        
      s.close();  
    }        
}

