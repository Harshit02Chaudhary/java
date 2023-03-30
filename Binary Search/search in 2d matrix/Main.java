import java.util.*;

// 3 4
// 1 3 5 7
// 10 11 16 20
// 23 30 34 60
// 10

/*find current row => cr = n/c => n = r*c
 *find current column => cc = n%c 
 */
public class Main {
    public static boolean SearchA2DMatrix(int[][] mat, int x) {
        //Write your code here
            // Return true or false
        int n = mat.length * mat[0].length;
        int row = mat.length, col = mat[0].length;
        int low = 0, high = n-1;
        while(low <= high) {
            
            int mid = low + (high-low)/2;
            int cr = mid/col;
            int cc = mid%col;
            
            if(mat[cr][cc] == x) {
                return true;
            }
            else if(mat[cr][cc] < x) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] mat = new int[m][n];
        for(int i = 0; i< m; i++) {
            for(int j = 0; j<n; j++)
                mat[i][j] = sc.nextInt();
        }
        int x = sc.nextInt();
        if(SearchA2DMatrix(mat, x))
            System.out.println("true");
        else
            System.out.println("false");
        sc.close();
    }
}