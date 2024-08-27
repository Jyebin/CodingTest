import java.util.*;

class Solution {
    public int solution(int[] sides) {
        //가장 긴 변의 길이 < 다른 두 변의 길이의 합
        //만들 수 있으면 1, 없으면 2 return
        Arrays.sort(sides); //오름차순 정렬
        if(sides[2] < sides[0] + sides[1]){
            return 1;
        }else{
            return 2;
        }
    }
}