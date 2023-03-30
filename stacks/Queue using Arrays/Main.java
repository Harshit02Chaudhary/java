import java.util.*;


class Queue {
    //Write your code here
	int arr[];
    int size = 1000;
    int front = 0, rear = 0;
    public Queue() {
        //Write your code here
		arr = new int[size];
    }

    public void push(int newElement) {
        //Write your code here
        if(rear == size) {
            return;
        }
        
        arr[rear] = newElement;
        rear++;
    }
    public int pop() {
        //Write your code here
        if(front == rear) {
            return -1;
        }
        
        int result = arr[front];

        for(int i=0; i<rear-1; i++) {
            arr[i] = arr[i+1];
        }

        rear--;
        return result;
    }
    public int front() {
        //Write your code here
        if(front == rear) {
            return -1;
        }
        return arr[front];
    }
    public int size() {
        //Write your code here
        return rear;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue q = new Queue();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            int op = sc.nextInt();
            if(op == 1) {
                int x = sc.nextInt();
                q.push(x);
            }
            else if(op == 2) {
                System.out.println(q.pop());
            }
            else if(op == 3)
                System.out.println(q.front());
            else if(op == 4)
                System.out.println(q.size());
        }
    }
}