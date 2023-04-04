package Arrays;

import java.util.Scanner;

public class setMatricesToZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[][] matrix = new int[n][m];

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        setZeroes(matrix);
        sc.close();
    }

    public static void setZeroes(int[][] matrix) {

        //brute force
            // int n = matrix.length, m = matrix[0].length;
            
            // int[][] dummy = new int[n][m];
    
            // for(int i=0; i<n; i++) {
            //     for(int j=0; j<m; j++) {
            //         dummy[i][j] = matrix[i][j];
            //     }
            // }
    
            // for(int i=0; i<n; i++) {
            //     for(int j=0; j<m; j++) {
            //         if(matrix[i][j] == 0) {
    
            //             for(int k=0; k<m; k++) {
            //                 dummy[i][k] = 0;
            //             }
            //             for(int k=0; k<n; k++) {
            //                 dummy[k][j] = 0;
            //             }
            //         }
            //     }
            // }
    
            // for(int i=0; i<n; i++) {
            //     for(int j=0; j<m; j++) {
            //         matrix[i][j] = dummy[i][j];
            //     }
            // }
        
        //optimal
            int col0 = 1, n = matrix.length, m = matrix[0].length;
    
            for(int i=0; i<n; i++) {
                if(matrix[i][0] == 0) col0 = 0;
                for(int j=1; j<m; j++) {
                    if(matrix[i][j] == 0) 
                        matrix[i][0] = matrix[0][j] = 0;
                }
            }
    
            for(int i=n-1; i>=0; i--) {
                for(int j=m-1; j>=1; j--) {
                    if(matrix[i][0] == 0 || matrix[0][j] == 0) 
                        matrix[i][j] = 0;    
                }
                if(col0 == 0) matrix[i][0] = 0;
            }
        }
}
        

