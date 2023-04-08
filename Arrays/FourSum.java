package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    
}
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        if(n==0||n<3){
            return ans;
        }
        if(target==-294967296 || target==294967296){
            return ans;
        }
        for(int i=0; i<n; i++) {
            
            int target_3 = target-nums[i];
            for(int j=i+1; j<n; j++) {
                int target_2 = target_3-nums[j];
                int l = j+1, h = n-1;
                while(l<h) {
                    List<Integer> sAns = new ArrayList<>();
                    if(nums[l]+nums[h] == target_2) {
                        sAns.add(nums[i]);
                        sAns.add(nums[j]);
                        sAns.add(nums[l]);
                        sAns.add(nums[h]);
                        ans.add(sAns);
                        
                        while(l<h && nums[l] == sAns.get(2)) l++;

                        while(l<h && nums[h] == sAns.get(3)) h--;
                    }
                    else if(nums[l]+nums[h] < target_2)
                        l++;
                    else 
                        h--;
                }
                while(j+1<n && nums[j+1] == nums[j]) j++;
            }
            while(i+1<n && nums[i+1] == nums[i]) i++;
        }
        return ans;
    }
}