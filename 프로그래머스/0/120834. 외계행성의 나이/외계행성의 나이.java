import java.util.*;

class Solution {
    public String solution(int age) {
        Character[] ch = new Character[10];
        int num = 0;
        for(int i=0; i<10; i++){
            num = i + 97;
            ch[i] = (char)num;
        }
        String input = age + "";
        String answer = "";
        String[] input1 = input.split("");
        for(int i=0; i<input1.length; i++){
            answer = answer + ch[Integer.parseInt(input1[i])];
        }

        return answer;
    }
}