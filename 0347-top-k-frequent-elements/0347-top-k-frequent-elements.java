class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer>[] bucket = new List[nums.length + 1];
        
        for (int num: nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        for (Integer key: map.keySet()) {
            int freq = map.get(key);
            if (bucket[freq] == null) {
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(key);
        }
        
        int[] ans = new int[k];
        int count = 0;
        
        for (int i = bucket.length - 1; i >= 0 && count < k; i--) {
            if (bucket[i] != null) {
                for (Integer integer: bucket[i]) {
                    ans[count++] = integer;
                }
            }
        }
        return ans;
    }       
}