class Solution {
    public int[] productExceptSelf(int[] nums) {
//         int ans = 1;
//         int zeroProd = 1;
//         int[] list = new int[nums.length];
//         boolean bool = true;
//         for (int i = 0; i < nums.length; i++) {
//             if (nums[i] != 0) {
//                 bool = false;
//             }
//         }
//         if (bool == true) {
//             for (int i = 0; i < nums.length; i++) {
//                 list[i] = 0;
//             }
//         }
//         for (int i = 0; i < nums.length; i++) {
//             ans *= nums[i];
//             if (nums[i] == 0 && i != nums.length - 1) {
//                 i++;
//             }
//             if (nums[i] == 0 && i == nums.length -1) {
//                 break;
//             }
//             zeroProd *= nums[i];
//         }
        
        
//         for (int i = 0; i < nums.length; i++) {
//             if (nums[i] != 0) {
//             list[i] = ans/nums[i];
//             } else {
//                 list[i] = zeroProd;
//             }
//         }
//         return list;
        
        int n = nums.length;
        int[] result = new int[n];
        
        // Calculate prefix products and store them in the result array.
        result[0] = 1;
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }
        
        // Calculate suffix products and update the result array.
        int suffixProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= suffixProduct;
            suffixProduct *= nums[i];
        }
        
        return result;
    }
}
