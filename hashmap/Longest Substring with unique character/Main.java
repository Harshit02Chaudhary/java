import java.util.*;

//apahjwtesplweqfmnmymtqreleinkopmfpvomqueghdmxkynwxzqnswaxgnjw

class Solution {
    public int longestSubstring(String s) {
        //Write your code here
		HashSet<Character> set = new HashSet<>();
        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            set.add(ch);
        }

        HashMap<Character, Integer> map = new HashMap<>();
        int inc = -1, exc = -1;
        String ans = "";

        while(true) {

            boolean flag1 = false;
            boolean flag2 = false;

            while(inc < s.length()-1 && map.size() <= set.size()) {

                inc++;
                char ch = s.charAt(inc);
                map.put(ch, map.getOrDefault(ch, 0) + 1);

				if(map.size() == set.size()) {
					String currans = s.substring(exc+1, inc+1);
	                if(ans.length() == 0 || currans.length() < ans.length()) {
	                    ans = currans;
	                } 
				}
                flag1 = true;
            }

            while(exc < inc && map.size() > set.size()) {

                exc++;
                char ch = s.charAt(exc);
                map.put(ch, map.getOrDefault(ch, 0) - 1);

                if(map.get(ch) == 0) {
                    map.remove(ch);
                }
                flag2 = true;
            }

            if(flag1 == false && flag2 == false) {
                break;
            }
        }
        return ans.length();
    }
}

public class Main {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc=new Scanner(System.in);
        String s = sc.nextLine();
        Solution ob = new Solution();
        int ans=ob.longestSubstring(s);
        System.out.println(ans);
    }
}