import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        int[] numStr = new int[numbers.length];
        for(int i=0;i<numbers.length;i++){
            numStr[i] = String.parseInt(numbers[i]);
        }
        Arrays.sort(numbers, Collections.reverseOrder()); //오름차순으로 정렬
        String answer = "";
        for(int i=numbers.length-1;i>=0;i--){
            answer = answer + numbers[i];
        }
        return answer;
    }
}