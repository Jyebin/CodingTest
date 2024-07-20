import java.util.*;

class Solution{
    public int solution(String s){
        Stack<Character> stack = new Stack<>();
        int answer = 0;
        //stack에서의 상위값이랑 현재 집어넣으려는 값이랑 같으면 둘 다 pop
        for(int i=0;i<s.length();i++){
            char now = s.charAt(i); //현재 문자
            if(!stack.isEmpty() && now == stack.peek()){ //현재 글자와 스택의 최상단 요소가 같고 스택이 비어있지 않다면
                stack.pop(); //최상단 요소 pop
            }else{ //현재 글자와 스택의 최상단 요소가 다르거나 스택이 비어있다면
                stack.push(now); //현재 요소를 stack에 넣음
            }
        }
        if(stack.isEmpty()){
            answer = 1;
        }
        return answer;
    }
}