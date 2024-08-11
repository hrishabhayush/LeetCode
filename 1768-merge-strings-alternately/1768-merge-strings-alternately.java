class Solution {
    public String mergeAlternately(String word1, String word2) {
        
// RECURSIVE SOLUTION: Time complexity higher because using the substring method and then recursive call stacks increase the space complexity. 
//         if (word1.isEmpty()) {
//             return word2;
//         } 
//         if (word2.isEmpty()) {
//             return word1;
//         }
        
//         return word1.charAt(0) + "" + word2.charAt(0) + mergeAlternately(word1.substring(1), word2.substring(1));
//     }
        
        int i = 0;
        int j = 0;
        StringBuilder word = new StringBuilder();
        
        while (i < word1.length() || j < word2.length()) {
            if (i < word1.length()) {
                word.append(word1.charAt(i++));
            }
            if (j < word2.length()) {
                word.append(word2.charAt(j++));
            }
        }
        
        return word.toString();
    }
}