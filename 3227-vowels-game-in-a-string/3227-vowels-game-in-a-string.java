class Solution {
    public boolean doesAliceWin(String s) {
        int numberOfVowels = 0;
        for (int i=0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                numberOfVowels++;
            }
        }
        
        if (numberOfVowels == 0) {
            return false;
        }
        if (numberOfVowels % 2 == 1) {
            return true;
        } else {
            return true;
        }
    }
}