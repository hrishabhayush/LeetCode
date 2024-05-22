Time complexity: O(n^2) and Space complexity: O(1) for the solution with two for loops.
        
However, we need a solution with better time complexity
An approach of Hashamps seems reasonable here, because we then just look for the corresponding number that sums up to the target. So, we store the values in the Hashmap at corresponding indices, and if the value corresponding to that index sum to the target we return these two indices. 
