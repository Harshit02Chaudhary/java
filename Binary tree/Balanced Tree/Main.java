import java.util.*;

public class Main {

  static Node getNode(int data) {
    // Allocate memory
    Node newNode = new Node();

    // put in the data
    newNode.data = data;
    newNode.left = newNode.right = null;
    return newNode;
  }

  // function to construct a BST from
  // its level order traversal
  static Node LevelOrder(Node root, int data) {
    if (root == null) {
      root = getNode(data);
      return root;
    }
    if (data <= root.data) 
        root.left = LevelOrder(root.left, data); 
    else 
        root.right = LevelOrder(root.right, data);
    return root;
  }

  static Node constructBst(int arr[], int n) {
    if (n == 0) return null;
    Node root = null;

    for (int i = 0; i < n; i++) root = LevelOrder(root, arr[i]);

    return root;
  }

  public static boolean isBalanced(Node root) {
    // your code here
	  if(root == null) {
		  return true;
	  }

	  boolean left = isBalanced(root.left);
	  boolean right = isBalanced(root.right);

	  boolean diff = Math.abs(height(root.left) - height(root.right)) <= 1;
      
      if(left && right && diff) {
        return true;
      }

      return false;
  }

  static int height(Node node) 
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

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] tree = new int[n];
    for (int i = 0; i < n; i++) tree[i] = sc.nextInt();
    sc.close();
    Node root = constructBst(tree, n);
    if (isBalanced(root)) System.out.println("true"); else System.out.println(
      "false"
    );
  }
}

class Node {

  int data;
  Node left, right;
}