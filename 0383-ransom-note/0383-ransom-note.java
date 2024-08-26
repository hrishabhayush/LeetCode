class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> res = new HashMap<>();
        
        for (int i=0; i < magazine.length(); i++) {
            char c = magazine.charAt(i);
            res.put(c, res.getOrDefault(c, 0) + 1);
        }
        
        for (int j=0; j < ransomNote.length(); j++) {
            char c = ransomNote.charAt(j);
            
            if (!res.containsKey(c) || res.get(c) == 0){
                return false;
            } else {
                res.put(c, res.get(c) -1);
            }
        }
        return true;
    }
}