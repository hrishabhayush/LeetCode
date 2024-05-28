The main trick in this question was avoiding the duplicates, so while maintaining the main condition (j < k) we also need to check that nums[i] == nums[i-1] to avoid the duplicate for the first number. Similarly, nums[j] == nums[j-1], as we need to check the value against the value at previous index. For the value at kth index, we need to check nums[k] == nums[k+1] to avoid the duplicates. 

Use the sort method to sort the array which simplifies our work of using conditionals with sum. 
