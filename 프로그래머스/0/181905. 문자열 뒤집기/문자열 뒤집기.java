import java.util.*;

class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        //s부터 e까지 뒤집은 문자열 return
        String first = my_string.substring(0,s);
        StringBuffer sb = new StringBuffer(my_string.substring(s,e+1));
        String mid = sb.reverse().toString();
        String end = my_string.substring(e+1);
        answer = first + mid + end;
        return answer;
    }
}