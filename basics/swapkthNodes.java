import java.util.*;
//import java.io.*;

class Node {
	int data;
	Node next;
	
	Node(int data){
		this.data = data;
		next = null;
	}
}

class LinkedList {
	Node head;

	void add(int data){
		Node new_node = new Node(data);
		if(head == null){
			head = new_node;
			return;
		}
		Node curr = head;
		while(curr.next != null){
			curr = curr.next;
		}
		curr.next = new_node;
	}

	int getlength(){
		int len = 0;
		Node curr = head;
		while(curr != null){
			curr = curr.next;
			len++;
		}
		return len;
	}

	Node getnode(int idx){
		Node curr = head;
		int i=1;
		while(i < idx){
			curr = curr.next;
		}
		return curr;
	}

	void swapkth(int idx){
		//get length of LL
		int len = getlength();

		if(idx > len)
			return;

		if(2*idx - 1 == len)
			return;

		Node x = head;
		Node x_prev = null;
		for(int i=1; i<idx; i++){
			x_prev = x;
			x = x.next;
		}

		Node y = head;
		Node y_prev = null;
		for(int i=1; i<len-idx+1; i++){
			y_prev = y; 
			y = y.next;
		}

		if(x_prev != null)
			x_prev.next = y;
		
		if(y_prev != null)
			y_prev.next = x;

		Node temp = x.next;
		x.next = y.next;
		y.next = temp;

		if(idx==1)
			head = y;

		if(idx==len)
			head = x;
	}
	void printList(){
		Node curr = head;
		while(curr != null){
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
		System.out.println();
	}
}
public class swapkthNodes {

    public static void main(String args[]) {
        //Write your code here
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int k = s.nextInt();
		LinkedList ll = new LinkedList();
		for(int i=1; i<=n; i++){
			ll.add(s.nextInt());
		}

		ll.swapkth(k);
		ll.printList();
		s.close();
    }
}

