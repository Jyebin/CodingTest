import java.util.*;

class Solution {
    public int solution(String s) {
        //왼쪽으로 회전
        String[] str = s.split("");
        int answer = 0;
        int len = s.length();
        for(int i=0; i<len; i++){
            String rotated = s.substring(i) + s.substring(0,i);
            Stack<Character> stack = new Stack<>();
            
            for(int j=0; j<rotated.length(); j++){
                if(rotated.charAt(j)=='{' || rotated.charAt(j)=='(' || rotated.charAt(j)=='['){
                    stack.add(rotated.charAt(j));
                } else { //pop하는 로직
                    if(stack.isEmpty()){ //비어있으면 pop할 수 없음
                        stack.add(rotated.charAt(j)); //스택이 비지 않았다는 것을 알려주기 위해 추가
                        continue;
                    }
                    if(rotated.charAt(j) == '}' && stack.peek() == '{' || 
                       rotated.charAt(j) == ')' && stack.peek() == '(' || 
                       rotated.charAt(j) == ']' && stack.peek() == '['){
                       stack.pop();
                    }else{
                        break;
                    }
                }
            }
            if(stack.isEmpty()){
                answer++;
            }
        }
        return answer;
        
    }
}
