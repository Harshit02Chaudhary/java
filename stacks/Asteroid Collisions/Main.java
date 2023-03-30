import java.util.*;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        //Write code here
        Stack<Integer> st = new Stack<>();

        for(int asteroid : asteroids) {
        //if it is positive push it into stack
            if(asteroid > 0) {
                st.push(asteroid);
            }
            else
            {
                //if asteroid is greater
                while(!st.isEmpty() && st.peek() > 0 && st.peek() < -asteroid) {
                    st.pop();
                }
                //if negative asteroid is on left of positive asteroid.......means they will never collide
                if(st.isEmpty() || st.peek() < 0) {
                    st.push(asteroid);
                }
                //if positive and negative asteroids are equal
                else if(!st.isEmpty() && st.peek() == -asteroid) {
                    st.pop();
                }
            
            }

        }

        int ans[] = new int[st.size()];

        for(int i=ans.length-1; i>=0; i--) {
            ans[i] = st.peek();
            st.pop();
        }

        return ans;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        Solution Obj = new Solution();
        int[] result = Obj.asteroidCollision(arr);
        for (int i = 0; i < result.length; ++i)
            System.out.print(result[i] + " ");
        System.out.println();
        sc.close();
    }
}