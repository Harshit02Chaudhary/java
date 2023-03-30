import java.util.*;

class Node {

  int data;
  Node left, right;
}

class Solution{
    static void printBoundary(Node node)
    {
    // Your code here
        if(node == null) {
            return;
        }

        System.out.print(node.data + " ");
        leftTraversal(node.left);
        leafTraversal(node);
        rightTraversal(node.right);
    }

    static void leftTraversal(Node node) {
        if(node == null || node.left == null && node.right == null) {
            return;
        }

        System.out.print(node.data + " ");

        if(node.left != null) {
            leftTraversal(node.left);
        }
        else {
            leftTraversal(node.right);
        }
    }

    static void rightTraversal(Node node) {
        if(node == null || node.left == null && node.right == null) {
            return;
        }

        if(node.right != null) {
            rightTraversal(node.right);
        }
        else {
            rightTraversal(node.left);
        }

        System.out.print(node.data + " ");

    }

    static void leafTraversal(Node node) {
        if(node == null) {
            return;
        }
        if(node.left == null && node.right == null) {
            System.out.print(node.data + " ");
        }

        leafTraversal(node.left);
        leafTraversal(node.right);
    }
}
public class Main {

  static Node getNode(int data) {
    // Allocate memory
    Node newNode = new Node();

    // put in the data
    newNode.data = data;
    newNode.left = newNode.right = null;
    return newNode;
  }

  static Node LevelOrder(Node root, int data) {
    if (root == null) {
      root = getNode(data);
      return root;
    }
    if (data <= root.data) root.left =
      LevelOrder(root.left, data); else root.right =
      LevelOrder(root.right, data);
    return root;
  }

  static Node constructBst(int arr[], int n) {
    if (n == 0) return null;
    Node root = null;

    for (int i = 0; i < n; i++) root = LevelOrder(root, arr[i]);

    return root;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] tree = new int[n];
    for (int i = 0; i < n; i++) tree[i] = sc.nextInt();
    sc.close();
    Node root = constructBst(tree, n);
    Solution.printBoundary(root);
  }
}
