import java.util.*;

class Pair {
    int row1;
    int row2;
    int col1;
    int col2;
}

class Solution {

    public List<Integer> solve(int matrix[][], Pair query[]) {
        // Your code here
        int n = matrix.length;
        int m = matrix[0].length;

        int[][] pref = new int[n][m];
        
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                int A = i-1 >= 0 ? pref[i-1][j] : 0;
                int B = j-1 >= 0 ? pref[i][j-1] : 0;
                int C = i-1 >= 0 && j-1 >= 0 ? pref[i-1][j-1] : 0;
                int D = matrix[i][j];

                pref[i][j] = A + B + D - C;
            }
        }

        List<Integer> list = new ArrayList<>();
        
        for(int i=0; i<query.length; i++) {
            Pair p = query[i];
            int r1 = p.row1, r2 = p.row2, c1 = p.col1, c2 = p.col2;

            int A = pref[r2][c2];
            int B = c1-1 >= 0 ? pref[r2][c1-1] : 0;
            int C = r1-1 >= 0 ? pref[r1-1][c2] : 0;
            int D = r1-1 >=0 && c1-1 >= 0 ? pref[r1-1][c1-1] : 0;

            int queryAns = A - B - C + D;

            list.add(queryAns);
        }
    return list;
    }
}

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int matrix[][] = new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            matrix[i][j]=sc.nextInt();
        }
        int q = sc.nextInt();
        Pair query[] = new Pair[q];

        Solution obj = new Solution();
        for (int i = 0; i < q; i++) {
            Pair p=new Pair();
            p.row1 = sc.nextInt();
            p.col1 = sc.nextInt();
            p.row2 = sc.nextInt();
            p.col2 = sc.nextInt();
            query[i]=p;
        }
        List<Integer> ans = obj.solve(matrix, query);
        for(int x: ans)
        System.out.println(x);
        sc.close();
    }
}