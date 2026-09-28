import java.util.Arrays;

class Solution {
    public String solution(String s) {
        int len = s.length();
        Character[] arr = new Character[len];
        
        for(int i=0; i<len; i++){
            arr[i] = s.charAt(i);
        }
        
        Arrays.sort(arr, (a, b) -> {
            if(a - b > 0){ //내림차순이면
                return -1;
            }
            return 1; //자리바꾸기
        });
        
        
        String answer = "";
        for(int i=0; i<len; i++){
            answer += arr[i];
        }
        return answer;
    }
}