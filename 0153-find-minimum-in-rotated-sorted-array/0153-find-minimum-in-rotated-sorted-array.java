class Solution {
    public int findMin(int[] nums) {
        int first = 0;
        int last = nums.length - 1;
        
        if (nums[first] <= nums[last]) {
            return nums[first];
        }
        
        while (first < last) {
             int mid = first + (last - first) / 2;
            
            if (nums[mid] >= nums[last]) {
                first = mid + 1;
            } else {
                last = mid;
            }
        }
        
        return nums[first];
    }
}