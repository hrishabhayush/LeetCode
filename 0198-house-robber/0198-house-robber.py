class Solution(object):
    def rob(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        
        if len(nums) == 0:
            return 0
        if len(nums) == 1:
            return nums[0]
        
        dp = [0]*len(nums)
        
        for i in range(len(nums)):
            dp[i] = max(nums[i] + dp[i-2], dp[i-1])
            
        return dp[-1]