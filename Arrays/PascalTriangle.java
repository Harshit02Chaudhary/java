package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class PascalTriangle {

    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> triangle = pascalTriangle(n);
        for (int i = 0; i < triangle.size(); i++) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                System.out.print(triangle.get(i).get(j) + " ");
            }
            System.out.println();
        }
        sc.close();
    }

	public static ArrayList<ArrayList<Integer>> pascalTriangle(int numRows) {
        // write code here
		ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
		for(int i=0; i<numRows; i++) {
			ans.add(new ArrayList<>());
		}

		for(int i=0; i<numRows; i++) {
			for(int j=0; j<=i; j++) {
				if(i == j) {
					ans.get(i).add(1);
					break;
				}
				int num1 = j-1 >= 0 ? ans.get(i-1).get(j-1) : 0;
				int num2 = ans.get(i-1).get(j);
				ans.get(i).add(num1+num2);
			}
		}
		return ans;
    }
}
