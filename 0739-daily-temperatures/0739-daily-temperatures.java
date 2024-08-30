class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> res = new Stack<>();
        int n = temperatures.length;
        int[] ans = new int[n];
        
        for (int i = 0; i < n ; i++) {
            while (!res.isEmpty() && temperatures[res.peek()] < temperatures[i]) {
                int idx = res.pop();
                ans[idx] = i - idx;
            }
            res.push(i);
        }
        
        return ans;
    }
}