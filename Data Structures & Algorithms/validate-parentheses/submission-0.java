class Solution {
    public boolean isValid(String s) {
        Map<Character,Character> brackets = Map.of(
            '(', ')',
            '{', '}',
            '[', ']'
        );
        Stack<Character> stack = new Stack<>();
        
        for(char ch: s.toCharArray()){
            if(brackets.containsKey(ch)){
                stack.push(brackets.get(ch));
            } else if (!stack.isEmpty() && stack.peek() == ch){
                stack.pop();
            }else {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
