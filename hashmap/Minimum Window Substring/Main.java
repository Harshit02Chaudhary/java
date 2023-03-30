//import java.io.*;
import java.util.*;

class Solution {
    public String minWindow(String s, String t) {
		// write code here
        HashMap<Character, Integer> freq = new HashMap<>();
        
        for(int i=0; i<t.length(); i++) {
            char ch = t.charAt(i);
            freq.put(ch,freq.getOrDefault(ch, 0) + 1);
        }

        HashMap<Character, Integer> map = new HashMap<>();
        int inc = -1, exc = -1;
        int matchcnt = 0;
        String ans = "";

        while(true) {
            boolean flag1 = false;
            boolean flag2 = false;
            //include till you get desired window
            while(inc < s.length() && matchcnt <= t.length()) {

                inc++;
                char ch = s.charAt(inc);
                map.put(ch, map.getOrDefault(ch, 0) + 1);

                if(map.containsKey(ch) && map.get(ch) <= freq.get(ch)) {
                    matchcnt++;

                }
                flag1 = true;
            }

            //exclude from window till a desired character is removed 
            while(exc < inc && matchcnt == t.length()) {
                //comparing current window and previous window
                String currans = s.substring(exc+1,inc+1);
                if(ans.length() == 0 || currans.length() < ans.length()) {
                    ans = currans;
                }

                exc++;
                char ch = s.charAt(exc);
                map.put(ch, map.getOrDefault(ch, 0) - 1);

                if(map.containsKey(ch) && map.get(ch) < freq.get(ch)) {
                    matchcnt--;
                }

                if(map.get(ch) == 0) {
                    map.remove(ch);
                }
                flag2 = true;
            }

            if(flag1 == false && flag2 == false) {
                break;
            }
        }
        return ans;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s,t;
        s = sc.next();
		t = sc.next();
        Solution Obj = new Solution();
        System.out.print(Obj.minWindow(s,t));
    }
}