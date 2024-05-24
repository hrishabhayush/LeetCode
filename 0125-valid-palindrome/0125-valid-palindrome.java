class Solution {
    public boolean isPalindrome(String s) {
        String checkPalindrome = "";
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                checkPalindrome += Character.toLowerCase(c);
            }
        }
        int left = 0;
        int right = checkPalindrome.length() - 1;
        
        if (checkPalindrome.length() <= 1) {
            return true;
        }
        while (left < right) {
            if (checkPalindrome.charAt(left) != checkPalindrome.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;  
    }
}