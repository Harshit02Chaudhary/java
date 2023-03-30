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
        System.out.println(g.diameter(root1));
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

class Solution {

    int height(Node node) 
    {
        //write your code here
        if(node == null) {
            return 0;
        }

        int left = height(node.left);
        int right = height(node.right);

        int ans = Math.max(left, right) + 1;

        return ans;
    }

//8 2 1 3 N N 5    
    public int diameter(Node root) {
        // Your code here
        if(root == null) {
            return 0;
        }

        int left = diameter(root.left);
        int right = diameter(root.right);

        int curr = height(root.left) + height(root.right) + 1;

        int ans = Math.max(curr, Math.max(left, right));

        return ans;

    }

}