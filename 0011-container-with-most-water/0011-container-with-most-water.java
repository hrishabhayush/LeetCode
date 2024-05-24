class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxVolume = 0;
        while (left < right) {
            int volume = Math.min(height[left], height[right]) * (right - left);
            if (volume > maxVolume) {
                maxVolume = volume;
            }
            
            if (height[left] > height[right]) {
                right--;
            } else {
                left++;
            }
        }
        return maxVolume;
    }
}