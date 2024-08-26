class Solution {
    public boolean isValid(String s) {
        Stack<Character> res = new Stack<>();
        
        for(int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            
            if (current == '(' || current == '{' || current == '[' ) {
                res.push(current);
            } 
            else if (current == ')' || current == '}' || current == ']') {
                if (res.isEmpty()) {
                    return false;
                }
                
                char top = res.pop();
                
                if ((current == ')'  && top != '(') ||
                   (current == '}' && top != '{') ||
                   (current == ']' && top != '[') ) {
                    return false;
                }
            }
        }

        return res.isEmpty();
    }
}