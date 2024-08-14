import java.util.*;

class Solution {
    public String solution(String my_string) {
        StringBuffer sb = new StringBuffer(my_string);
        String answer = sb.reverse().toString(); //인스턴스에 대한 정보를 문자열로 반환
        return answer;
    }
}