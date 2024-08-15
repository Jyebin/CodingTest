import java.util.*;

class Solution {
    public String solution(String letter) {
        //letter를 소문자로 바꾼 문자열 반환
        String[] morse = {".-","-...","-.-.","-..",".","..-.",
                "--.","....","..",".---","-.-",".-..","--","-.",
                "---",".--.","--.-",".-.","...","-","..-","...-",
                ".--","-..-","-.--","--.."};
        String[] input = letter.split(" "); //띄어쓰기를 기준으로 구분
        int len = input.length;
        String answer = "";
        
        for(int i=0; i<len; i++){ //글자 길이만큼 반복
            for(int j=0; j<morse.length; j++){ //모스부호만큼 반복
                if(input[i].equals(morse[j])){
                    answer = answer + Character.toString(j +'a');
                }
            }
        }

        return answer;
    }
}