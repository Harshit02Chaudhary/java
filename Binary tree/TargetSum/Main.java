import java.util.*;

class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

class BinarySearchTree {
    Node constructBST(int[] arr, int start, int end, Node root) {
        if (start > end)
            return null;
        int mid = (start + end) / 2;

        if (root == null)
            root = new Node(arr[mid]);

        root.left = constructBST(arr, start, mid - 1, root.left);
        root.right = constructBST(arr, mid + 1, end, root.right);

        return root;

    }
}

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();

        Arrays.sort(arr);
        Node root = null;
        BinarySearchTree bst = new BinarySearchTree();
        root = bst.constructBST(arr, 0, n - 1, root);

        Accio A = new Accio();
        A.targetSum(root, target);

        sc.close();
    }
}

class pair {
	Node node;
	int state;

	public pair(Node node, int state) {
		this.node = node;
		this.state = state;
	}
}

class Accio {

    public Node getNormal(Stack<pair> st) {
        while(st.size() > 0) {
            pair top = st.peek();
            if(top.state == 1) {
                top.state++;
                if(top.node.left != null) st.push(new pair(top.node.left, 1));
            }
            else if(top.state == 2) {
                top.state++;
                if(top.node.right != null) st.push(new pair(top.node.right, 1));
                return top.node;
            }
            else {
                st.pop();
            }
        }
        return null;
    } 

    public Node getReverse(Stack<pair> st) {
        while(st.size() > 0) {
            pair top = st.peek();
            if(top.state == 1) {
                top.state++;
                if(top.node.right != null) st.push(new pair(top.node.right, 1));
            }
            else if(top.state == 2) {
                top.state++;
                if(top.node.left != null) st.push(new pair(top.node.left, 1));
                return top.node;
            }
            else {
                st.pop();
            }
        }
        return null;
    }

    public void targetSum(Node root, int tar)
    {
        // your code here
		Stack<pair> normalInorder = new Stack<>();
		Stack<pair> reverseInorder = new Stack<>();

        normalInorder.push(new pair(root, 1));
        reverseInorder.push(new pair(root, 1));

        Node left = getNormal(normalInorder);
        Node right = getReverse(reverseInorder);
        boolean printed = false;

        while(left.data < right.data) {
            if(left.data + right.data == tar) {
                System.out.print(left.data + " " + right.data);
                left = getNormal(normalInorder);
                right = getReverse(reverseInorder);
                printed = true;
            }
            else if(left.data + right.data < tar) {
                left = getNormal(normalInorder);
            }
            else {
                right = getReverse(reverseInorder);
            }
        }
        
        if(!printed) {
            System.out.println(-1);
        }
    }

}