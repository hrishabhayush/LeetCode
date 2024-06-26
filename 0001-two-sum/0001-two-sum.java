class Solution {
    public int[] twoSum(int[] nums, int target) {
        // int[] ansSet = new int[2];
        // for (int i = 0; i < nums.length; i++) {
        //     for (int j = 0; j < i; j++) {
        //         if (nums[i] + nums[j] == target) {
        //             ansSet[0] = i;
        //             ansSet[1] = j;
        //         }
        //     }
        // }
        // return ansSet;
        
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] {
                    i, map.get(complement)
                };
            }
        }
        return null; // If no solution found
    }
}
