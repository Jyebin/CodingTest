import java.util.*;
class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        //my_string에서 letter을 제거한 문자열 return -> replace 사용
        answer = my_string.replace(letter, ""); //letter를 빈칸으로 변경
        
        return answer;
    }
}