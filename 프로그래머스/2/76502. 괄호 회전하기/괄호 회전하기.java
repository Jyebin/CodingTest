import java.util.*;

class Solution {
    public int solution(String s) {
        //괄호를 스택에 저장 -> 열리는 괄호면 스택에 1 넣기, 닫히는 괄호면 1 빼기
        //스택이 비어 있다면 올바른 괄호, 안비어있다면 올바르지 않은 괄호
        //이중 for문 활용. for문을 이용해서 index 수정
        int length = s.length();
        int cnt = 0;
        
        for(int i=0; i<length; i++){ //몇 번째 문자열이 맨 처음에 올 것인지를 설정해 주는 반복문
            Stack<Character> stack = new Stack<>();
            
            StringBuffer sb = new StringBuffer();
            
            for(int j=i; j<length + i; j++){ //문자열을 순회하는 반복문
                if(length-1 < j){ //j가 문자열 길이보다 더 커지는 순간에만
                    sb.append(s.charAt(j-length));
                }else{
                    sb.append(s.charAt(j));
                }
            }
            boolean isValid = true;
            for(int k=0;k<sb.length();k++){
                char c = sb.charAt(k);
                if(c=='{' || c == '[' || c=='('){
                    stack.push(c);
                }else{
                    if(stack.isEmpty()){
                        isValid = false;
                        break;
                    }
                    char top = stack.pop(); //스택의 상위 요소를 가져옴
                    if(c == '}' && top != '{'){
                        isValid = false;
                        break;
                    }else if(c == ']' && top != '['){
                        isValid = false;
                        break;
                    }else if(c == ')' && top != '('){
                        isValid = false;
                        break;
                    }
                }
            }
            if(isValid && stack.isEmpty()){
                cnt++;
            }
        }
        return cnt;
    }
}
