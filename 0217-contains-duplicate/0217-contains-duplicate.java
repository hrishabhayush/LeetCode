class Solution {
    public boolean containsDuplicate(int[] nums) {
        // HashMap<Integer, Integer> map = new HashMap<>();
        // for (int i = 0; i < nums.length; i++) {
        //     map.put(nums[i], i);
        // }
        // for (int i = 0; i < nums.length; i++) {
        //     int duplicate = nums[i];
        //     if (map.containsKey(duplicate) && map.get(duplicate) != i) {
        //         return true;
        //     } 
        // }
        // return false;
        
        HashSet<Integer> set = new HashSet<>();
        for (int num: nums) { // Iterate over the available integers
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }
}