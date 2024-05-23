class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> frequency = new HashMap<>();
        
        for (char x: s.toCharArray()) {
            frequency.put(x, frequency.getOrDefault(x, 0)+ 1);
        }
        
        for (char x: t.toCharArray()) {
            frequency.put(x, frequency.getOrDefault(x, 0)- 1);
        }
        
        for (int i: frequency.values()) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }
    
}