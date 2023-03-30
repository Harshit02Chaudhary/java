import java.util.LinkedList;
import java.util.Queue;
import java.io.*;
//import java.util.*;

class Main {
    static Node buildTree(String str) {
        if (str.length() == 0 || str.charAt(0) == 'N') {
            return null;
        }
        String ip[] = str.split(" ");
        Node root = new Node(Integer.parseInt(ip[0]));
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int i = 1;
        while (queue.size() > 0 && i < ip.length) {
            Node currNode = queue.peek();
            queue.remove();
            String currVal = ip[i];
            if (!currVal.equals("N")) {
                currNode.left = new Node(Integer.parseInt(currVal));
                queue.add(currNode.left);
            }
            i++;
            if (i >= ip.length) break;
            currVal = ip[i];
            if (!currVal.equals("N")) {
                currNode.right = new Node(Integer.parseInt(currVal));
                queue.add(currNode.right);
            }
            i++;
        }

        return root;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine();
        Node root1 = buildTree(s1);
        Solution g = new Solution();
        g.binaryTreeZigZagTraversal(root1);
    }
}


class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
/*     1
     /   \
    3      2
   / \    / \
  4   5  6   7
*/
class Solution {
    public void binaryTreeZigZagTraversal(Node root) {
        // Your code here
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        boolean left_to_right = true;

        while(!q.isEmpty()) {

            int size = q.size();
            int[] arr = new int[size];

            for(int i=0; i<size; i++) {
                Node temp = q.peek();
                q.remove();

                int index = left_to_right ? i : size - i - 1;
                arr[index] = temp.data;

                if(temp.left != null) {
                    q.add(temp.left);
                }
                if(temp.right != null) {
                    q.add(temp.right);
                } 
            }

            left_to_right = !left_to_right;

            for(int p : arr) 
                System.out.print(p + " ");
                
        }

    }
}