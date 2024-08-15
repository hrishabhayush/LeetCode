class Solution {
    public int[][] merge(int[][] intervals) {
        // The intervals would contain lists in somewhat sorted order
        List<int[]> ans = new ArrayList<>();
        int n = intervals.length; 
        
        // sort the list of time intervals based on the start time
        // O(nlgn)
        
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        
        int[] currentInterval = intervals[0];
        ans.add(currentInterval);

        for (int i=1; i < n; i++) {
            int currentEnd = currentInterval[1];
            int nextStart = intervals[i][0];
            int nextEnd = intervals[i][1];
            
            if (currentEnd >= nextStart ) {
                currentInterval[1] = Math.max(currentEnd, nextEnd);
            } else {
                currentInterval = intervals[i];
                ans.add(currentInterval);
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
}