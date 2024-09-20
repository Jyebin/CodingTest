import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 2;
        //n이 제곱수면 1, 아니면 2
        if(n == (int)Math.sqrt(n) * (int)Math.sqrt(n)){
            answer = 1;
        }
        return answer;
    }
}