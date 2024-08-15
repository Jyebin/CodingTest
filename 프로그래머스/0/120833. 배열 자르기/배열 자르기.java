import java.util.*;
class Solution {
    public ArrayList solution(int[] numbers, int num1, int num2) {
        ArrayList<Integer> answer = new ArrayList<>();
        //num1부터 num2까지 자른 정수 배열 return
        for(int i=num1; i<=num2; i++){
            answer.add(numbers[i]);
        }
        return answer;
    }
}