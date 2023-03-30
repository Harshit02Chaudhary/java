import java.util.*;

class Solution {
    void missingNumbers(int n, int arr[], int m, int brr[]) {
        //Write your code here
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();

        ArrayList<Integer> ans = new ArrayList<>();

        for(int i : arr) {
            if(map1.containsKey(i)){
                map1.put(i, map1.get(i)+1);
            }
            else{
                map1.put(i, 1);
            }
        }
        for(int j : brr) {
            if(map2.containsKey(j)){
                map2.put(j, map2.get(j)+1);
            }
            else{
                map2.put(j, 1);
            }
        }

        for(int key : map2.keySet()) {
            if(map1.containsKey(key)){
                if(map1.get(key) != map2.get(key)){
                    ans.add(key);
                }
                else{
                    continue;
                }
            }
            else{
                ans.add(key);
            }
        }
        Collections.sort(ans);
        for(int a : ans){
            System.out.print(a + " ");
        }
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }

        int m = sc.nextInt();
        int brr[] = new int[m];
        for(int i=0; i<m; i++){
            brr[i]= sc.nextInt();
        }

        Solution Obj = new Solution();
        Obj.missingNumbers(n,arr,m,brr);
        sc.close();
    }
}