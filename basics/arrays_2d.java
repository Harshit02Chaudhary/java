import java.util.Scanner;
public class arrays_2d {
    public static void main(String[] args){
        
    //transpose of matrix
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        //int m = s.nextInt();
        int arr[][] = new int[n][n];
        //taking input for 2d array
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = s.nextInt();
            }
        }
        boolean flag  = true;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i == j && arr[i][j] == 0){
                    flag = false;
                    break;
                }
                if((i + j == n-1) && arr[i][j] == 0){
                    flag = false;
                    break;
                }
                if(i != j && i+j != n-1 && arr[i][j] != 0){
                    flag = false;
                    break;
                }
            }
        }
        if(flag == true){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
        // for(int i=0; i<n; i++){
        //     for(int j=0; j<n; j++){
        //         System.out.print(arr[j][i]);
        //     }
        //     System.out.println();
        // }

    //spiral print of matrix 
        // Scanner s = new Scanner(System.in);
        // int n = s.nextInt();
        // int m = s.nextInt();
        
        // int arr[][] = new int[n][m];
        // //taking input for 2d array
        // for(int i=0; i<n; i++){
        //     for(int j=0; j<m; j++){
        //         arr[i][j] = s.nextInt();
        //     }
        // }

        // int sr = 0, sc = 0, er = n-1, ec = m-1;
        // int count = 0, total = m*n;

        // while(count < total){

        //     //starting row
        //     for(int i=sc; i<=ec && count<total; i++){
        //         System.out.print(arr[sr][i] + " ");
        //         count++;
        //     }
        //     sr++;
        //     //ending column
        //     for(int i=sr; i<=er && count<total; i++){
        //         System.out.print(arr[i][ec] + " ");
        //         count++;
        //     }
        //     ec--;
        //     //ending row
        //     for(int i=ec; i>=sc && count<total; i--){
        //         System.out.print(arr[er][i] + " ");
        //         count++;
        //     }
        //     er--;
        //     //starting column
        //     for(int i=er; i>=sr && count<total; i--){
        //         System.out.print(arr[i][sc] + " ");
        //         count++;
        //     }
        //     sc++;
        // }


        // Scanner s = new Scanner(System.in);
        // int n = s.nextInt();
        // int m = s.nextInt();
        
        // int arr[][] = new int[n][m];
        // //taking input for 2d array
        // for(int i=0; i<n; i++){
        //     for(int j=0; j<m; j++){
        //         arr[i][j] = s.nextInt();
        //     }
        // }

        // int endrow = n-1;

        // for(int i=0; i<m; i++){
        //     for(int j=endrow; j>=0; j--){
        //         System.out.print(arr[j][i] + " ");
        //     }
        //     System.out.println();
        // }

//Richest Customer Wealth

        
        // int ans = 0;
        // for(int i=0; i<n; i++){
        //     int rowsum = 0;
        //     for(int j=0; j<m; j++){
        //         rowsum += arr[i][j];
        //     }   
        //     ans = Math.max(rowsum, ans);

        // }
        // System.out.print(ans);


        s.close();
    }
}
