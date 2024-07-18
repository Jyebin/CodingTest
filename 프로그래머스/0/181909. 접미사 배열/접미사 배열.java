import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        //접미사 : 특정 인덱스부터 시작하는 문자열
        //문자열을 맨 앞에꺼부터 제거해서 새 문자열을 만듦
        //만든 문자열의 맨 앞 수를 기준으로 정렬
        int length = my_string.length();
        String[] str = my_string.split("");
        String[] answer = new String[length];
        
        for(int i=0;i<length;i++){
            StringBuffer sb = new StringBuffer();
            for(int j=i;j<length;j++){
                sb.append(str[j]);
            }
            answer[i] = sb.toString();
        }
        Arrays.sort(answer);
        return answer;
    }
}