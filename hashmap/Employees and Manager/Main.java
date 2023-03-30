//import java.io.*;
import java.util.*;

class Solution {

    public void EmpUnderManager(Map<String, String> map) {
		HashMap<String, ArrayList<String>> tree = new HashMap<>();
        String ceo = "";

        for(String emp : map.keySet()) {
            
            String man = map.get(emp);

            if(man.equals(emp)){
                ceo = man;
                continue;
            }

            if(tree.containsKey(man)) {
                ArrayList<String> temp = tree.get(man);
                temp.add(emp);
                tree.put(man, temp);
            }
            else {
                ArrayList<String> newList = new ArrayList<>();
                newList.add(emp);
                tree.put(man, newList);
            }
        }

        TreeMap<String, Integer> tmap = new TreeMap<>();
        getSize(ceo, tree, tmap);

        for(String ans : tmap.keySet()) {
            System.out.println(ans + " " + tmap.get(ans));
        }
	}

    int getSize(String man, HashMap<String, ArrayList<String>> tree, TreeMap<String, Integer> tmap) {
        //base case : if employee is not a manager
        if(tree.containsKey(man) == false) {
            tmap.put(man, 0);
            return 1;
        }

        int sz = 0;
        for(String emp : tree.get(man)) {
            sz += getSize(emp, tree, tmap);
        }

        tmap.put(man, sz);
        return sz+1;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        Map<String,String> emp = new HashMap<String, String>();
        for(int i=0;i<n;++i){
			emp.put(sc.next(),sc.next());
        }
        Solution Obj = new Solution();
        Obj.EmpUnderManager(emp); 
        sc.close();
    }
}