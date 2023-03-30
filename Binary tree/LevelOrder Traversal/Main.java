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


static void LevelOrderTraversal(Node root) {
    Queue<Node> q = new LinkedList<>();
    q.add(root);

    while(!q.isEmpty()) {
        Node temp = q.peek();
        q.remove();
        
        System.out.print(temp.data + " ");

        if(temp.left != null) {
            q.add(temp.left);
        }

        if(temp.right != null) {
            q.add(temp.right);
        }
    }

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] tree = new int[n];
    for (int i = 0; i < n; i++) tree[i] = sc.nextInt();
    sc.close();
    Node root = constructBst(tree, n);
    LevelOrderTraversal(root);
    
  }
}

class Node {

  int data;
  Node left, right;
}