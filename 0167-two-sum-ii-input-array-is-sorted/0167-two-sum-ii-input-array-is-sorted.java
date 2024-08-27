class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length - 1;
        int[] ans = new int[2];
        while (l < r) {
            if (numbers[l] + numbers[r] == target) {
                ans[0] = l+1;
                ans[1] = r+1;
            }
            if (numbers[l] + numbers[r] > target) {
                r--;
            } else {
                l++;
            }
        }
        return ans;
    }
}