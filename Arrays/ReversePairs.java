package Arrays;

public class ReversePairs {
    
}
class Solution {
    public int reversePairs(int[] nums) {
        return mergeSort(nums, 0, nums.length-1);
    }
    public int mergeSort(int[] nums, int low, int high) {
        if(low >= high) return 0;
        int mid = low + (high-low)/2;
        int cnt = mergeSort(nums, low, mid);
        cnt += mergeSort(nums, mid+1, high);
        cnt += merge(nums, low, mid, high);
        return cnt;
    }
    public int merge(int[] nums, int low, int mid, int high) {
        int cnt = 0;
        int j = mid+1;
        for(int i=low; i<=mid; i++) {
            while(j <= high && nums[i] > 2*(long)nums[j]) 
                j++;
            cnt += j-(mid+1);
        }

        int[] temp = new int[high-low+1];
        int left = low, right = mid+1, p = 0;
        while(left <= mid && right <=high) {
            if(nums[left] <= nums[right]) {
                temp[p++] = nums[left++];
            }
            else {
                temp[p++] = nums[right++];
            }
        }
        while(left <= mid) temp[p++] = nums[left++];
        while(right <= high) temp[p++] = nums[right++];

        for(int i=low; i<=high; i++) {
            nums[i] = temp[i-low];
        }
        return cnt;
    }
}
