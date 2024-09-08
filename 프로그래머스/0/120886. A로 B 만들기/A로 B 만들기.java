import java.util.*;

class Solution {
    public int solution(String before, String after) {
        //순서를 그냥 뒤집는 것이 아님
        //무작위로 섞어도 됨
        //문자열의 길이가 같고, 각 문자의 개수가 같으면 됨
        int answer = 0;
        if (before.length() != after.length()) {
            answer = 0;
        }
        
        char[] aArr = before.toCharArray();
        char[] bArr = after.toCharArray();

        Arrays.sort(aArr);
        Arrays.sort(bArr);

       if (Arrays.equals(aArr, bArr)) {
            return 1;
        }
        
        return answer;
    }
}