import java.util.*;

class Solution {
    boolean areAnagram(String c1, String c2) {
       //Write your code here
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for(int i=0; i<c1.length(); i++) {
            char c = c1.charAt(i);

            if(map1.containsKey(c)) {
                map1.put(c, map1.get(c)+1);
            }
            else {
                map1.put(c, 1);
            }
        }

        for(int i=0; i<c2.length(); i++) {
            char c = c2.charAt(i);

            if(map2.containsKey(c)) {
                map2.put(c, map2.get(c)+1);
            }
            else {
                map2.put(c, 1);
            }
        }

        for(Character ch : map1.keySet()) {
            if(!map2.containsKey(ch)) {
                return false;
            }
            else {
                if(map1.get(ch) != map2.get(ch)) {
                    return false;
                }
            }
        }

        return true;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        Solution Obj = new Solution();
        
        if (Obj.areAnagram(str1, str2))
            System.out.println("Yes");
        else
            System.out.println("No");
            sc.close();
    }
}
