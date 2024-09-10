import java.util.*;

class Solution {
    public int solution(int[] sides) {
        //가장 긴 변의 길이 < 나머지 두개의 합
        Arrays.sort(sides);
        int answer = 0;
        int sum = sides[0] + sides[1];
        for(int i=sides[1]; i<sum; i++){ //가장 긴 변일 경우 -> 배열에서 가장 긴 변보다 크고 두개의 합 보다 작아야 함
            answer ++;
        }
        for(int i=1; i<sides[1]; i++){ //가장 긴 변이 아닐 경우 -> 가장 긴 변의 길이보다 작아야 함
            if(sides[0]+i>sides[1]){
                answer ++;
            }
        }
  
        return answer;
    }
}