package Arrays;

import java.util.ArrayList;
import java.util.List;

public class MajorityElement3 {
    
}
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int num1 = -1, num2 = -1;
        int c1 = 0, c2 = 0;

        for(int i=0; i<nums.length; i++) {
            if(num1 == nums[i]) 
                c1++;
            else if(num2 == nums[i])
                c2++;
            else if(c1 == 0) {
                num1 = nums[i];
                c1 = 1;
            }
            else if(c2 == 0) {
                num2 = nums[i];
                c2 = 1;
            }
            else {
                c1--;
                c2--;
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        c1 = 0; c2 = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == num1)
                c1++;
            if(nums[i] == num2)
                c2++;
        }
        if(num1 == num2) ans.add(num1);
        else {
            if(c1 > nums.length/3) ans.add(num1);
            if(c2 > nums.length/3) ans.add(num2);
        }
        return ans;
    }
}