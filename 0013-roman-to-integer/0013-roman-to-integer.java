class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> value = new HashMap<>();
        
        value.put('I', 1);
        value.put('V', 5);
        value.put('X', 10);
        value.put('L', 50);
        value.put('C', 100);
        value.put('D', 500);
        value.put('M', 1000);
        
        int sum = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (i + 1 < s.length() && value.get(s.charAt(i)) < value.get(s.charAt(i+1))) {
                sum -= value.get(s.charAt(i));
            } else {
                sum += value.get(s.charAt(i));
            }
        }
        
        return sum;
    }
}