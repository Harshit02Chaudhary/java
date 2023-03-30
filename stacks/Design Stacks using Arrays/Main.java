import java.util.*;

class Main {
    public static void main(String[] args) {
        StackUsingLinkedlist obj = new StackUsingLinkedlist();
        Scanner sc = new Scanner(System.in);
        int q;
        q = sc.nextInt();
        while (q-- > 0) {
            int x;
            x = sc.nextInt();
            if (x == 1) {
                int y;
                y = sc.nextInt();
                obj.push(y);
            }
            if (x == 2) {
                System.out.println(obj.peek());
            }
            if (x == 3) {
                obj.pop();
            }
            if (x == 4) {
                obj.display();
            }
        }
        sc.close();
    }
}
/*
    6
    1 5
    1 9
    2
    3
    3
    2
*/
class StackUsingLinkedlist {

    ArrayList<Integer> st;
    int top = -1;
    StackUsingLinkedlist() {
        //Complete the function
        st = new ArrayList<>();
    }

    public void push(int x) {
        //Complete the function
        if(top > 10000) {
            return;
        }
        top++;
        st.add(x);
    }

    public int peek() {
        //Complete the function
        if(top == -1) {
            return -1;
        }
        return st.get(top);
    }

    public void pop() {
        //Complete the function
        if(top == -1) {
            return;
        }
        //System.out.println(st.get(top));
        st.remove(top);
        top--;
    }

    public void display() {
        //Complete the function
        if(top == -1) {
            return;
        }
        
        for(int i = top; i >= 0; i--) {
            System.out.print(st.get(i) + " ");
        }
    }
}
