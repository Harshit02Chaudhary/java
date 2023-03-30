//import java.util.*;

class node{
    int data;
    node next;

    public node(int d){
        data = d;
    }
}

public class linkedlist{
    static node head;
    static node tail;

    public static void addlast(int d){
        node nn = new node(d); 

        if(head == null){
            head = nn;
            tail = nn;
        }

        tail.next = nn;

        tail = nn;

    }

    public static void display(){
        node curr = head;

        while(curr != null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }

    }

    public static void addfirst(int data){
        node f = new node(data);

        if(head == null){
            head = f;
            tail = f;
        }

        f.next = head;
        head = f;
    }

    public static void removefirst(){
        
        if(head == null){
            System.out.println("cannot remove anything....."); //should have at least one element
        }
        else if(head == tail){
            head = null;
            tail = null;
        }
        else{
            head = head.next;
        }
    }

    public static void addAt(int index, int data){
        if(index == 0){
            addfirst(data);
            return;
        }
        node a = new node(data);
        
        node curr = getAt(index);
        
        if(curr != null){
            node nextofcurr = curr.next;
            curr.next = a;
            a.next = nextofcurr;
        }
    }

    public static node getAt(int index){
        node curr = head;
        if(index < 0){
            return null;
        }
        for(int i=0; i<index; i++){
            if(curr.next == null){
                return null;
            }
            curr = curr.next;
        }
        return curr;
    }

    public static void removelast(){
        
        if(head == null){
            return;
        }
        else if(head == tail){
            tail.next = null;
            return;
        }
        else{
            node curr = head;
            while(curr.next.next != null){
                curr = curr.next;
            }
            curr.next = null;
            tail = curr;
        }
        
    }

    public static int getLength(node head){
        node curr = head;
        int length = 0;
        while(curr != null){
            curr = curr.next;
            length++;
        }
        return length;
    }

    public static void removeAt(int index){
        int size = getLength(head);
        if(index == 0){
            removefirst();
        }
        else if(index == size-1){
            removelast();
        }
        else{
        node prev = getAt(index-1);
        prev.next = prev.next.next; 
        }       

    }

    public static void main(String[] agrs){ 

        //node a = new node(10);
        

        for(int i=0; i<=10; i++){
            addlast(i);
        }

        //System.out.println(head.data);
        //System.out.println(tail.data);

        // a.next = head;
        // head = a;
        //System.out.println(head.next.data);

        display();

        // addfirst(a.data);
        // System.out.println();
        // display();

        // removefirst();
        // System.out.println();
        // display();

        // addAt(3, 15);
        System.out.println();
        // display();

        removelast();
        //System.out.println(b.data);
        display();

        // removeAt(0);
        // display();

        
    }

}



