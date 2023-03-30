import java.util.*;

class Solution {

    //global declaration of hastable
    List<Integer>[] hashtable;
    int size = 750000;

    //constructor call for intitializing size
    Solution() {
        hashtable = new LinkedList[size];
    }

    //hashFunction which uses hashcode and retrieves correct position of key
    int hashFunction(int key) {
        return key % size;
    }

    //addFunction
    void add(int key) {
        //First we need to retrieve "index"
        int id = hashFunction(key);
        
        //now check if any linkedlist is present on that index or it is null
        if (hashtable[id] == null) {
            hashtable[id] = new LinkedList<>();
        }

        //check if correct index of that key is is -1. If it is add the value
        if(hashtable[id].indexOf(key) == -1) {
            hashtable[id].add(key);
        }
    }

    //remove function
    void remove(int key) {
        int id = hashFunction(key);

        //if that particular index is null that means no such element is present
        if (hashtable[id] == null) {
            return;
        }

        if(hashtable[id].indexOf(key) != -1) {
            hashtable[id].remove(hashtable[id].indexOf(key));
        }

    }

    boolean contains (int key) {
        int id = hashFunction(key);
        
        if(hashtable[id].indexOf(key) == -1) {
            return false;
        }else{
            return true;
        }

    }
}

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        Solution Obj = new Solution();
        for (int i = 0; i < q; i++) {
            int choice = sc.nextInt();
            int key = sc.nextInt();
            if (choice == 1) {
                // Add
                Obj.add(key);
            } else if (choice == 2) {
                // contains
                if (Obj.contains(key)) {
                    System.out.print("True ");
                } else {
                    System.out.print("False ");
                }
            } else if (choice == 3) {
                // remove
                Obj.remove(key);
            }
        }
        System.out.println();
        sc.close();
    }
}