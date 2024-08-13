class Solution {
    public String longestCommonPrefix(String[] strs) {
        int min_len = Integer.MAX_VALUE;
        for (int i=0; i < strs.length; i++) {
            if (strs[i].length() < min_len) {
                min_len = strs[i].length();
            }
        }
        
        StringBuilder word = new StringBuilder();
        for (int i=0; i < min_len; i++) {
            char currentChar = strs[0].charAt(i);
            for (int j=0; j < strs.length; j++) {
                if (strs[j].charAt(i) != currentChar) {
                    return word.toString();                    
                }
            }
            word.append(currentChar);
        }
        
        return word.toString();
    }
}