import java.io.*;
import java.util.*; 

class Main{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M[][] = new int[N][N];
        for(int i=0; i<N; i++)
            for(int j=0; j<N; j++)
                M[i][j] = sc.nextInt();
        System.out.println(new Solution().findCelebrity(M,N));
        sc.close();
    } 
} 
class Solution
{ 
    int findCelebrity(int M[][], int n)
    {
       Stack<Integer> st = new Stack<>();

       for(int i=0; i<n; i++) {
        st.push(i);
       }

       while(st.size() >= 2) {
        
        int pc1 = st.pop();
        int pc2 = st.pop();

        if(M[pc1][pc2] == 1) {
            st.push(pc2);
        }
        else {
            st.push(pc1);
        }

       }

       int celeb = st.pop();

       for(int i=0; i<n; i++) {
        if(M[celeb][i] == 1) {
            return -1;
        }
       }

       for(int i=0; i<n; i++) {
        if(i != celeb && M[i][celeb] == 0) {
            return -1;
        }
       }

       return celeb;
    }

}