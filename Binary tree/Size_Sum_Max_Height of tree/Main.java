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
        System.out.println(g.sizeOfTree(root1));
        System.out.println(g.sumOfTree(root1));
        System.out.println(g.maxOfTree(root1));
        System.out.println(g.heightOfTree(root1));
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

//1 2 3 4 5 N N N N N N1    
class Solution {
    public int sizeOfTree(Node root) {
        if(root == null) {
            return 0;
        }
        int left = sizeOfTree(root.left);
        int right = sizeOfTree(root.right);

        int ans = left + right + 1;

        return ans;
    }

    public int sumOfTree(Node root) {
        if(root == null) {
            return 0;
        }

        int left = sumOfTree(root.left);
        int right = sumOfTree(root.right);

        int sum = left + right + root.data;

        return sum;
    }

    public int maxOfTree(Node root) {
        if(root == null) {
            return 0;
        }

        int left = maxOfTree(root.left);
        int right = maxOfTree(root.right);

        int ans = Math.max(root.data, Math.max(left, right));

        return ans;
    }

    public int heightOfTree(Node root) {
        if(root == null) {
            return 0;
        }
        
        int left = heightOfTree(root.left);
        int right = heightOfTree(root.right);

        int ans = Math.max(left, right) + 1;

        return ans;
    }
}   