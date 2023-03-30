import java.util.*;
// 5
// 1 2 3 4 5

// -1 1 2 3 4
class Accio{
    static int[] HeightProblem(int n,int[] arr){
        //write code here
		Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];
        for(int i=0; i<arr.length; i++) {

            if(st.size() == 0) {
                ans[i] = -1;
            }
            else
            {
                while(st.size() > 0 && st.peek() >= arr[i]) {
                    st.pop();
                }
                if(st.size() == 0) {
                    ans[i] = -1;
                }
                else{
                    ans[i] = st.peek();
                }
            }
            st.push(arr[i]);
        }
        return ans;
    }
}

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;++i){
            arr[i] = sc.nextInt();
        }
        Accio obj = new Accio();
        int[] ans=obj.HeightProblem(n,arr);
        for(int i=0;i<n;++i){
            System.out.print(ans[i] + " ");
        }
    }
}
