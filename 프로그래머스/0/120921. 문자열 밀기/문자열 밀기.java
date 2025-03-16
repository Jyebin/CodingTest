import java.util.*;

class Solution {
    public int solution(String A, String B) {
        int answer = -1;
        //A : 밀어야 할 문자
        //B : 정답 문자
        String answerStr = A;
        String a = A;
        String lastChar = "";
        
        for(int i=0; i <= A.length(); i++){
            if(answerStr.equals(B)){ //문자를 바꿀 필요가 없는 경우
                answer = 0;
                return answer;
            }
            
            lastChar = a.substring(a.length() - 1); //맨 마지막 문자
            System.out.println("마지막 문자 : " + lastChar);
            answerStr = a.substring(0, a.length() - 1); //첫번째부터 맨 마지막 앞 문자까지 남기기
            System.out.println("그냥 문자 : " + answerStr);
            
            a = lastChar + answerStr;
            System.out.println("정답 문자 : " + a);
            System.out.println();

            if(a.equals(B)){
                answer = i + 1;
                return answer;
            }
        }
        return answer;
    }
}