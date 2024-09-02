import java.util.*;

class Solution {
    public String solution(String my_string) {
        my_string = my_string.toLowerCase();
        String[] list = my_string.split("");
        Arrays.sort(list);
        String answer = "";
        for(int i=0; i<list.length; i++){
            answer += list[i];
        }
        return answer;
    }
}