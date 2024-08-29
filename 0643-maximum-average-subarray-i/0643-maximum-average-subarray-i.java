class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double total = 0;
        for (int i = 0; i < k; i++) {
            total += nums[i];
        }
        double maxTotal = total;
        for (int i=0; i < nums.length - k; i++) {
            total -= nums[i];
            total += nums[i+k];
            if (total > maxTotal) {
                maxTotal = total;
            }
        }
        return (double)(maxTotal/k);
    }
}