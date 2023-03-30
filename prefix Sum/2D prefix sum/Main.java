import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr2D = new int[n][m];

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                arr2D[i][j] = scn.nextInt();
            }
        }

        int[][] prefix2D = new int[n][m];

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                int A = i-1 >= 0 ? prefix2D[i-1][j] : 0;
                int B = j-1 >= 0 ? prefix2D[i][j-1] : 0;
                int C = i-1>=0 && j-1>=0 ? prefix2D[i-1][j-1] : 0;
                int D = arr2D[i][j];

                prefix2D[i][j] = A + B - C + D;
            }
        }

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                System.out.print(prefix2D[i][j] + " ");
            }
            System.out.println();
        }
    }
}
