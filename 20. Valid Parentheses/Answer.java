class Solution {
    public boolean isValid(String s) {
    Stack<Character> stack = new Stack<>();
        
        Map<Character, Character> closeToOpenMap = new HashMap<>();
        closeToOpenMap.put(')', '(');
        closeToOpenMap.put('}', '{');
        closeToOpenMap.put(']', '[');
        
        for(char c : s.toCharArray()) {
            if( closeToOpenMap.containsKey(c)) {
                if(!stack.empty() && stack.peek() == closeToOpenMap.get(c)) {
                    stack.pop();
                } else {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        if(stack.empty()) return true;
        return false;
    }
}
