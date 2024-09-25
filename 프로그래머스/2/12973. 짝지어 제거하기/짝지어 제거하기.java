import java.util.*;

class Solution{
    public int solution(String s){
        //같은 알파벳이 2개 붙어 있는 짝을 찾음
        //이 두개를 제거
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++){
            char now = s.charAt(i);
            if(!stack.isEmpty() && stack.peek()==now){
                stack.pop();
            }else{
                stack.push(now);
            }
        }
        int answer = 0;
        if(stack.isEmpty()){
            answer = 1;
        }
        return answer;
    }
}