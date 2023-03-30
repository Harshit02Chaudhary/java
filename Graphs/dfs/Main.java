// import java.util.*;

// class Solution {
//     public static void DFSTraversal(List<List<Integer>> edges, int n) {
//         //Write your code here
//         ArrayList<ArrayList<Integer>> Graph = new ArrayList<>();
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int e = sc.nextInt();
//         List<List<Integer>> ed = new ArrayList<>();
//         for (int i = 0; i < e; i++) {
//             List<Integer> l = new ArrayList<>();
//             l.add(sc.nextInt());
//             l.add(sc.nextInt());
//             ed.add(l);
//         }

//         Solution ob = new Solution();
//         ob.DFSTraversal(ed, n);
//     }
// }

class paint {
    String Color;
    String Color2;

    paint() {
        System.out.println("default COlor : Red");
        fun();
    }

    void fun() {
        System.out.println("Fun"); 
    }

    paint(String Color) {
        this.Color = Color;
        
        System.out.println(Color);
    }

    paint(String Color, String Color2) {
        this.Color = Color; 
        this.Color2 = Color2;

        System.out.println(Color + " " + Color2); 
    }
}


public class Main {
    public static void main(String[] args) {
        paint obj = new paint();
        obj.fun();
    }
}
