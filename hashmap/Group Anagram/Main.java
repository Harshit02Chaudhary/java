
// A Java program to print all anagrams together
import java.util.*;

// 5
// cat dog tac god act
public class Main {
    // Given a list of words in wordArr[],
    static void printAnagramsTogether(String wordArr[], int size) {
        //your code here
/*Approach - 1 =============================================================== */
        // HashMap<String, ArrayList<String>> map = new HashMap<>();

        // for(int i=0; i<size; i++) {

        //     String str = wordArr[i];
        //     char[] arr = str.toCharArray();
        //     Arrays.sort(arr);
        //     String key = new String(arr);

        //     if(map.containsKey(key)) {
        //         map.get(key).add(str);
        //     }
        //     else {
        //         ArrayList<String> newlist = new ArrayList<>();
        //         newlist.add(str);
        //         map.put(key, newlist);
        //     }

        // }

        // for(String s: map.keySet()) {
        //     ArrayList<String> temp = map.get(s);

        //     for(String ss : temp)
        //         System.out.print(ss + " ");

        // }
/*================================================================================== */

/*Approach - 2 ===========using frequency array */

        HashMap<String, ArrayList<String>> map = new HashMap<>();

        for(int i=0; i<size; i++) {
            String str = wordArr[i];

            int[] freq = new int[26];
            for(int j=0; j<str.length(); j++) {
                char ch = str.charAt(j);
                freq[ch-'a']++;
            }

            //generate key
            StringBuilder key = new StringBuilder(""); 
            for(int j=0; j<26; j++) {
                if(freq[j] > 0) {
                    key.append((char)('a'+j));
                    key.append(freq[j]);
                }
            }

            if(map.containsKey(key.toString())) {
                map.get(key.toString()).add(str);
            }
            else {
                ArrayList<String> newlist = new ArrayList<>();
                newlist.add(str);
                map.put(key.toString(), newlist);
            }

        }

        List<List<String>> list = new ArrayList<>();
            for(String s : map.keySet()) {
                ArrayList<String> temp = map.get(s);
                list.add(temp);
            }


        return list;
        //System.out.print(list);



    }

    // Driver program to test above functions
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] wordArr = new String[n];
        for (int i = 0; i < n; i++)
            wordArr[i] = sc.next();
        sc.close();
        printAnagramsTogether(wordArr, n);
    }
}