class Solution {
    public int search(int[] nums, int target) {
        
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int first = 0;
        int last = nums.length - 1;
        
        while (first <= last) {
            int mid = first + (last - first) / 2;
            
            if (nums[mid] == target) {
                return mid;
            }
            
            // left sorted 
            else if (nums[mid] >= nums[first]) {
                if (nums[mid] >= target && nums[first] <= target) {
                    last = mid - 1;
                } else {
                    first = mid + 1;
                } 
            }
            
            // right sorted
            else {
                if (nums[mid] <= target && nums[last] >= target) {
                    first = mid + 1;
                } else {
                    last = mid - 1;
                }
            }
        }
        
        return -1;
    }
}