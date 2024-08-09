import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        Arrays.sort(array);
        int idx = (int)(array.length/2); //n.5로 나올텐데 무조건 반올림 될 것
        
        answer = array[idx];
        return answer;
    }
}