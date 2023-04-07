package Arrays;

public class MajorityElement {
    
}
class Solution {
    public int majorityElement(int[] nums) {
        // Arrays.sort(nums);
        // return nums[nums.length/2];
        int count = 0, element = 0;
        for(int i=0; i<nums.length; i++) {
            if(count == 0) {
                element = nums[i];
                count = 1;
            }
            else if(element == nums[i]) {
                count++;
            }
            else {
                count--;
            }
        }
        return element;
    }
    
}
