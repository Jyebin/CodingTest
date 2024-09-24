import java.util.*;

class Solution {
    boolean solution(String s) {
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<s.length(); i++){
            int now = s.charAt(i);
            if(now == '('){
                stack.add(1);
            }else if(!stack.isEmpty() && now == ')'){
                stack.pop();
            }else{
                return false;
            }
        }
        return stack.isEmpty();
    }
}