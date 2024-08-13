class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();
        int n = nums.length;
        
        if (n == 0) {
            return ans;
        }
        
        int i = 0;
        while (i < n) {
            int a = nums[i];
            while (i + 1 < n && nums[i] == nums[i+1] - 1) {
                i++;
            }
            int b = nums[i];
            
            if (a != b) {
                ans.add(a + "->" + b);
            } else {
                ans.add(String.valueOf(a));
            }
            i++;
        }
        
        return ans;
       
    }
}